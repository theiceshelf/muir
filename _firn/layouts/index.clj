(defn index
  [{:keys [render partials build-url]}]
  (let [{:keys [head]} partials]
    [:html.p0.m0
     (head build-url)
     [:body.index
      [:aside
       [:div
        [:img.py2 {:src "/static/img/icon.png" :style "max-width: 128px;"}]
        [:div
         (render "Meta" {:exclude-headline? true})]]]
      [:main
       [:article
        ;; [:div (render :toc)] ;; Optional; add a table of contents
        [:div.pb3
         [:div.h4.caps "Projects"]
         [:div (render "Projects" {:exclude-headline? true})]]

        [:div.pb3
         [:div.h4.caps "Community"]
         [:div (render "Community" {:exclude-headline? true})]]

        [:div.pb3
         [:div.h4.caps "Ethic"]
         [:div (render "Ethic" {:exclude-headline? true})]]]]]]))
