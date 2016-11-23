(ns test-type.proto)

(defprotocol IProto1
  (hello [_ arg]))

(defprotocol IProto2
  (hi [_ arg]))