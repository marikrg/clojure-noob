(ns clojure-noob.core
  (:gen-class))

(defn -main
  "Returns \"I'm a little teapot!\"."
  [& args]
  "I'm a little teapot!")

(defn inc-maker
  "Create a custom subtractor"
  [inc-by]
  #(+ % inc-by))

(defn dec-maker
  "Create a custom decrementor"
  [dec-by]
  #(- % dec-by))

(def inc100 (inc-maker 100))
(def dec100 (dec-maker 100))

(defn mapset
  "Returns a set of a given map"
  [&map]
  (set map))

(defn mapset
  "Returns a set of a given map"
  [f vect]
  (set (map f vect)))
