(ns test-type.my-reify
  (:require [test-type.proto :refer [IProto1 IProto2 hello hi]]))

(def reified
  (reify
    IProto1
    (hello [_ arg] (str "hello" arg))

    IProto2
    (hi [_ arg] (str "hi" arg))
    ))