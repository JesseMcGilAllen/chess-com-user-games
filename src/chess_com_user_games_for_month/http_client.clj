(ns chess-com-user-games-for-month.http-client
  (:require [clj-http.client :as client]))

(defn retrieve-games [username]
  (def url (str "https://api.chess.com/pub/player/" username "/games/2019/09/pgn"))
  ((client/get url) :body))

