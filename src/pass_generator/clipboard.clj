(ns pass-generator.clipboard)


(import [java.awt.datatransfer StringSelection])


(defn get-clipboard
  "Get default system clipboard."
  []
  (-> (java.awt.Toolkit/getDefaultToolkit)
      (.getSystemClipboard)))


(defn copy-to-clipboard
  "Copy passed text to default system clipboard."
  [text]
  (let [selection (StringSelection. text)]
    (.setContents (get-clipboard) selection selection)))
