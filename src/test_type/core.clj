(ns test-type.core
  (:require [test-type.proto :refer [hello hi]]
            [test-type.my-reify :refer [reified]]
            [test-type.my-type :refer [->MyType]]
            [test-type.my-record :refer [->MyRecord]]))

(defn use-reified [arg]
  (println (hello reified arg))
  (println (hi reified arg)))

(defn use-mytype [arg]
  (let [x (->MyType)]
    (println (hello x arg))
    (println (hi x arg))))

(defn use-myrecord [arg]
  (let [x (->MyRecord "hj")]
    (println (hello x arg))
    (println (hi x arg))))

