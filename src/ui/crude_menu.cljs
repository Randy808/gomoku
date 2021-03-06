(ns ui.crude-menu
  (:require [ui.textual :as textual]
            [ui.ascii_art :as ascii]
            [ui.graphic :as graphic]
            [ui.human :as human]
            [rum.core :as rum]))

(enable-console-print!)
(println "Loading gomoku application")

(rum/defc gomoku-app []
  [:div
   [:h1 {:style {:text-decoration "underline"}}
    "Menu of Gomoku application versions"]
   [:h2 "Textual"]
   (textual/gomoku-app)
   [:h2 "Ascii Art"]
   (ascii/gomoku-app)
   [:h2 "Graphic"]
   (graphic/gomoku-app)
   [:h2 "Human"]
   (human/gomoku-app)
   [:hr]])
