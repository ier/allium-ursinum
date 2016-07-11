(ns allium-ursinum.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[allium-ursinum started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[allium-ursinum has shut down successfully]=-"))
   :middleware identity})
