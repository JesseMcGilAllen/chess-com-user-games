(ns chess-com-user-games-for-month.core
  (:gen-class)
  (:require [chess-com-user-games-for-month.username :as un]
            [chess-com-user-games-for-month.http-client :as hc])
  )

(defn -main
  "I don't do a whole lot ... yet."
  []
  (def user (un/get-username))
  (println (hc/retrieve-games user)))
  ;; (println user)
  ;;(println (str "Hello " user "!")))
