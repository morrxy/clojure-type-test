(ns test-type.my-record
  (:require [test-type.proto :refer [IProto1 IProto2 hello hi]]))

(defrecord MyRecord [f1]
  IProto1
  (hello [_ arg] (str "hello" arg f1))

  IProto2
  (hi [_ arg] (str "hi" arg f1))
  )
