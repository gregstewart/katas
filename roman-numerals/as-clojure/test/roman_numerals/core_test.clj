(ns roman-numerals.core-test
  (:require [expectations :refer :all]
            [roman-numerals.core :refer :all]))

;; A 1 returns "I"
(expect "I" (to_roman 1))

;; A 2 returns "II"
(expect "II" (to_roman 2))

;; A 3 returns "III"
(expect "III" (to_roman 3))

;; A 4 returns "IV"
(expect "IV" (to_roman 4))

;; A 5 returns "V"
(expect "V" (to_roman 5))

;; A 6 returns "VI"
(expect "VI" (to_roman 6))

;; A 9 returns "IX"
(expect "IX" (to_roman 9))

;; A 10 returns "X"
(expect "X" (to_roman 10))

;; A 15 returns "XV"
(expect "XV" (to_roman 15))

;; A 16 returns "XVI"
(expect "XVI" (to_roman 16))

;; A 20 returns "XX"
(expect "XX" (to_roman 20))

;; A 40 returns "XL"
(expect "XL" (to_roman 40))

;; A 50 returns "L"
(expect "L" (to_roman 50))

;; A 90 returns "XC"
(expect "XC" (to_roman 90))

;; A 100 returns "C"
(expect "C" (to_roman 100))

;; A 490 returns "CDXC"
(expect "CDXC" (to_roman 490))

;; A 500 returns "D"
(expect "D" (to_roman 500))

;; A 900 returns "CM"
(expect "CM" (to_roman 900))

;; A 1000 returns "M"
(expect "M" (to_roman 1000))
