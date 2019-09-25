(ns chess-com-user-games-for-month.core
  (:gen-class)
  (:require [chess-com-user-games-for-month.username :as un]
            [chess-com-user-games-for-month.http-client :as hc]))

(defn -main
  "Gets the games played during the current month for the user name given"
  []
  (def user (un/get-username))
  (spit (str  (System/getProperty "user.home") "/Documents/games_" user ".pgn")
        (hc/retrieve-games user)))
