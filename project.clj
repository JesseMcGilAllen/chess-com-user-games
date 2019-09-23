(defproject chess-com-user-games-for-month "0.1.0-SNAPSHOT"
  :description "Retrieves Chess.com user games for the past thirty days and saves them to a file."
  :url "https://github.com/JesseMcGilAllen/chess-com-user-games"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [clj-http "3.10.0"]]
  :main ^:skip-aot chess-com-user-games-for-month.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
