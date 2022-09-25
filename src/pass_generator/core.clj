(ns pass-generator.core
  (:require [pass-generator.password :refer [generate-password]]
            [pass-generator.clipboard :refer [copy-to-clipboard]]
            [clojure.tools.cli :refer [parse-opts]])
  (:gen-class))


(def cli-options
  "CLI options defenition."
  [["-l" "--length LENGTH" "Password length"
    :default 8
    :parse-fn #(Integer/parseInt %)
    :validate [#(< 0 % 100) "Must be a number between 0 and 100"]]
   ["-h" "--help"]])


(defn -main
  "Password generator app entrypoint."
  [& args]
  (let [arguments (parse-opts args cli-options)
        options (:options arguments)
        help-msg (:summary arguments)]
    (if (:help options)
      (println help-msg)
      (let [password
            (generate-password (:length options))]
        (copy-to-clipboard password)
        (println password)))))
