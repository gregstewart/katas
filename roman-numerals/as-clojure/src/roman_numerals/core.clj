(ns roman-numerals.core)


(def numerals {1 "I",
               4 "IV",
               5 "V",
               9 "IX",
               10 "X",
               40 "XL",
               50 "L",
               90 "XC"
               100 "C",
               400 "CD",
               500 "D",
               900 "CM",
               1000 "M"})

(defn to_roman [decimal]
  (loop [[number & r :as numbers] (reverse (sort (keys numerals)))
         result ""
         d decimal]

    (if number
      (if (>= d number)
        (recur numbers (str result (get numerals number)) (- d number))
        (recur r result d))
      result)))
