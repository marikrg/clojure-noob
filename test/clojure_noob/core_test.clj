(ns clojure-noob.core-test
  (:require [clojure.test :refer :all]
            [clojure-noob.core :refer :all]))

(deftest test-main
  (testing "-main should return I'm a little teapot"
    (is (= (-main) "I'm a little teapot!"))))

(deftest test-add-100-with-positive-arg
  (testing "adds 100 to 3 should return 103."
    (is (= (inc100 3) 103))))

(deftest test-add-100-with-negative-arg
  (testing "adds 100 to -3 should return 97."
    (is (= (inc100 -3) 97))))

(deftest test-dec-100-with-positive-arg
  (testing "substracts 100 from 3 should return -97."
    (is (= (dec100 3) -97))))

(deftest test-dec-100-with-negative-arg
  (testing "substracts 100 from -3 should return -103."
    (is (= (dec100 -3) -103))))

(deftest test-mapset
  (testing "should return a set."
    (is (= (mapset inc [1 1 2 2]) #{2, 3}))))
