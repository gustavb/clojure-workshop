(defproject clojure-workshop "0.1.0-SNAPSHOT"
  :description
  "Workshop material for learning clojure.
  lein uberjar in solution branch will create the cat program."
  :url "https://github.com/stoyle/clojure-workshop"
  :license {:name "Creative Commons Attribution 4.0 International Public License"
            :url "http://creativecommons.org/licenses/by/4.0/"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.cli "0.3.1"]]
  :main clojure-workshop.cat
  :uberjar-name "cat.jar"
  :profiles {:dev {:dependencies [[midje "1.6.3"]]
                   :plugins [[lein-midje "3.1.1"]]
                   :resource-paths ["test-resources"]}
             :uberjar {:aot [clojure-workshop.cat]}}
  :jvm-opts ["-XX:-OmitStackTraceInFastThrow"])
