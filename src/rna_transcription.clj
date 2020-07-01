(ns rna-transcription
  (:require [clojure.string :as str]))

(defn to-rna [dna]
  (let [dna_map {:G "C"
                 :C "G"
                 :T "A"
                 :A "U"}
        incorrect-chars? (some? (re-find #"([^GCTA]+)" dna))]
    (if incorrect-chars?
      (throw (AssertionError. "Wrong input."))
      (str/join (map #((keyword (str %)) dna_map) dna)))))


