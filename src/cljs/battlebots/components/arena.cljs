(ns battlebots.components.arena)

(defn render-cell
  "renders a cell of a game board"
  [cell]
  (fn []
    [:li.cell cell]))

(defn render-row
  "renders a row of a game board"
  [row]
  (fn []
    [:ul.row
     (for [cell row]
       ^{:key (rand 100)} [render-cell cell])]))

(defn render-arena
  [game]
  [:div.active-game
   (for [row (:initial-arena game)]
     ^{:key (rand 100)} [render-row row])])
