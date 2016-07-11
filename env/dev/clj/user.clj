(ns user
  (:require [mount.core :as mount]
            allium-ursinum.core))

(defn start []
  (mount/start-without #'allium-ursinum.core/repl-server))

(defn stop []
  (mount/stop-except #'allium-ursinum.core/repl-server))

(defn restart []
  (stop)
  (start))


