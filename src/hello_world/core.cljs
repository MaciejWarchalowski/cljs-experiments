(ns hello-world.core
  (:require [cljsjs.react]
            [cljsjs.react.dom]))


(enable-console-print!)

(println "Hello world!")
(println "Goodbye world!")

(def header-element
  (.createElement js/React "h1" nil "Hello WORLD"))

(def header-render
  #js {:render (fn [] header-element)})

(def HelloHeader
  (.createClass js/React header-render))

(.render js/ReactDOM
  (.createElement js/React HelloHeader nil nil)
  (.getElementById js/document "anchor"))
