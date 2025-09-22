(ns is-function
  (:require [clojure.string]))

(defn -function? [points]
  (if
   (= (count points) (count (set (map first points))))
    "YES" "NO"))

(defn function? [points]
  (doseq [test-case points]
    (println (-function? test-case))))

(defn read-input []
  (->> (line-seq (java.io.BufferedReader. *in*))
       (map clojure.string/trim)
       (filter #(seq %))))

(defn parse-test-case [lines]
  (let [n (Integer/parseInt (first lines))
        point-lines (take n (rest lines))]
    [(map (fn [line]
            (let [[x y] (clojure.string/split line #"\s+")]
              [(Integer/parseInt x) (Integer/parseInt y)]))
          point-lines)
     (drop (inc n) lines)]))

(defn parse-all-input []
  (let [all-lines (read-input)
        t (Integer/parseInt (first all-lines))
        remaining-lines (rest all-lines)]
    (loop [test-cases []
           lines remaining-lines
           count t]
      (if (zero? count)
        test-cases
        (let [[test-case remaining] (parse-test-case lines)]
          (recur (conj test-cases test-case)
                 remaining
                 (dec count)))))))

(defn -main []
  (let [test-cases (parse-all-input)]
    (function? test-cases)))

(comment
  (function? '(([1 2] [3 4] [5 6]) ([7 8] [9 10])))
  (function? '(([0 0] [4 4]) ([-1 -1] [2 3] [5 -2] [1 1]) ([10 20]))))
