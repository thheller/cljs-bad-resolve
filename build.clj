(require '[cljs.build.api :as cljs])

(cljs/build
  "src"
  '{:output-dir "out"
    :optimizations :none
    :modules
    {:a {:output-to "out/a.js"
         :entries [demo.a]}
     :b {:output-to "out/b.js"
         :entries [demo.foo.b]
         :depends-on #{:a}}}
    :verbose true})
   
