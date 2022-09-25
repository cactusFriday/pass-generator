(defproject pass-generator "0.1.0-SNAPSHOT"
  :description "Simple password generator."
  :url "https://github.com/cactusFriday/pass-generator"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.cli "1.0.206"]]
  :main ^:skip-aot pass-generator.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
