(ns vomnibus.r
  (:use [vomnibus.loader :only [load-resource]]))

(def mtcars (load-resource "vomnibus/r/mtcars.clj"))
(def diamonds (load-resource "vomnibus/r/diamonds.clj"))
