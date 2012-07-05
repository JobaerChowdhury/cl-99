(ns basics.cl9)
(defn is-palindrome? [p]
  (cond 
    (empty? p) true
    (= (count p) 1) true
    (= (first p) (last p)) (is-palindrome? (rest (drop-last p)))
  :else false))   