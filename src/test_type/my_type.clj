(ns test-type.my-type
  (:require [test-type.proto :refer [IProto1 IProto2 hello hi]]))

(deftype MyType []
  IProto1
  (hello [_ arg] (str "hello" arg))

  IProto2
  (hi [_ arg] (str "hi" arg)))