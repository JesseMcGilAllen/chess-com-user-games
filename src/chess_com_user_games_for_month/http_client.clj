(ns chess-com-user-games-for-month.http-client
  (:require [clj-http.client :as client])
  (:import (java.time YearMonth)))

(defn retrieve-games [username]
  (def current-month (format "%02d" (. (. YearMonth now) getMonthValue)))
  (def current-year (. (. YearMonth now) getYear))
  (def url (str "https://api.chess.com/pub/player/" username "/games/"  current-year "/" current-month "/pgn"))
  ((client/get url) :body))

