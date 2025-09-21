(ns perimeter
  (:require [clojure.string]))

(defn -distance [[x1 y1] [x2 y2]]
  (let [x-diff (- x2 x1)
        y-diff (- y2 y1)]
    (Math/sqrt (+ (* x-diff x-diff) (* y-diff y-diff)))))

(defn eval-perimeter [points]
  (let [parsed-points (conj (vec points) (first points))]
    (reduce + (map -distance parsed-points (rest parsed-points)))))

(defn -main []
  (let [n (Integer/parseInt (read-line))
        points (doall
                (for [_ (range n)]
                  (mapv #(Integer/parseInt %)
                        (re-seq #"\d+" (read-line)))))]
    (println (eval-perimeter points))))

(comment
  (eval-perimeter [[0 0] [0 1] [1 1] [1 0]])
  (eval-perimeter [[458 695] [621 483] [877 469] [1035 636] [1061 825] [875 1023] [645 1033] [485 853]]))
