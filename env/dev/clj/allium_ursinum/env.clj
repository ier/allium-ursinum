(ns allium-ursinum.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [allium-ursinum.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[allium-ursinum started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[allium-ursinum has shut down successfully]=-"))
   :middleware wrap-dev})
