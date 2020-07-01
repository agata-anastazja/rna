(defproject rna-transcription "0.1.0-SNAPSHOT"
  :description "rna-transcription exercise."
  :url "https://github.com/exercism/clojure/tree/master/exercises/rna-transcription"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [lambdaisland/kaocha "1.0.632"]]
  :profiles {:kaocha {:dependencies [[lambdaisland/kaocha "1.0.632"]]}}
  :aliases {"kaocha" ["with-profile" "+kaocha" "run" "-m" "kaocha.runner"]})
