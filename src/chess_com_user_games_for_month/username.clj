(ns chess-com-user-games-for-month.username)

(defn get-username []
  (println "Please enter a Chess.com user name: ")
  (def username (read-line))
  (if-not (clojure.string/blank? username)
    username
    (get-username)))

