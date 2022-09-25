(ns pass-generator.core
  (:require [pass-generator.password :refer [generate-password]]
            [pass-generator.clipboard :refer [copy-to-clipboard]])
  (:gen-class))

(defn -main
  "Password generator app entrypoint."
  [& args]
  (copy-to-clipboard (generate-password 9)))

(-main)
