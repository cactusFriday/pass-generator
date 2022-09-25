(ns pass-generator.password)


(def ASCII-BEGIN 33) ;; allow symbols from "!"

(def ASCII-END 123) ;; allow symbols till "z"


(def available-chars
  "All available ASCII symbols for password generating."
  (reduce (fn [acc val]
            (str acc (char val)))
          ""
          (range ASCII-BEGIN ASCII-END)))


(defn generate-password
  "Generate password with a given length."
  [length]
  (loop [password ""]
    (if (= (count password) length)
      password
      (recur (str password (rand-nth available-chars))))))
