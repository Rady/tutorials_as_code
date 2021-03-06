; just some timepass code to remind of language structs
;
; CLOJURE
;
; Intro To Clojure
; -by Brian Will
;  http://www.youtube.com/playlist?list=PLAC43CFB134E85266

(println "I WAZ CLISP BEFORE! NOT THIS IN SINGLE-QUOTE")
(println (+ 1 2 3 4 5))
(println *clojure-version* "\n" + "\n" *file* "\n" - "\n" :KEYWORD_SYMBOL)
(println *compile-path* :key "abcde" 1 2)
(println "list" '(3 4 5)) ; list is (3 4 5) ...to data-fy it use apostrophe
(println "vector" [6 7 8 9])
(println "hashmap" {"f" "u" 1 2})
(println ({"f" "u" 1 2} "f"))
(println ({"f" "u" 1 2} 1))

;special forms list
; if conditional
(println ">>>>> if conditional")
(println ( if (< 1 2) "what" "now"))
(println ( if (> 1 2) "what"))
; quote
(println ">>>>> quote")
(println (quote (f (o) o)))
; def
(println ">>>>> def")
(def what {1 2 3 4}) ; var mapping
(println (what 3))
; do
(println ">>>>> do")
(println
  (do
    (def var1 "Var~1")
    (print)
    (what 1)
    )
  )
; let
(println ">>>>> let")
(def abc 1)
(def xyz 2)
(def pqr (let [abc "none" xyz 7] (println abc) (+ 3 xyz)))
(println pqr)
; fn
(println ">>>>> fn")
(def add (fn fn_add [num1, num2] (+ num1 num2) fn_add))
(def add (fn fn_add [num1, num2] (+ num1 num2) fn_add))
(println (add 1 9))
(def add (fn [num1, num2] (+ num1 num2)))
(println (add 1 9))
(def sub (fn [num1, num2] (- num1 num2)))
(println (sub 1 9))
; . (. class method argument*) (. instance method argument*)
(println ">>>>> .")
;(. System println "ABC") ; new (new class argument*)
(println ">>>>> new")
(new java.util.Date)
;(new java.util.Timer false)
(println ">>>>> clojure.core")
(println (clojure.core/+ 1 2))
(println (clojure.core/* 1 2))

; lexical scoping
(println ">>>>> lexical scoping")
(println (let [abc 1000]
              (def plus100 (fn [abc] (+ abc 100)))
              (println (plus100 1))
              (sub 1500 abc)
    )
  )

; NameSpacing Vars
(println ">>>>> clojure namespacing")
(clojure.core/in-ns (quote abk))
(def msg "welcome")
(clojure.core/println msg)
(clojure.core/in-ns (quote abionic))
(def msg "sayonara")
(clojure.core/println msg)
(clojure.core/in-ns (quote abk))
(clojure.core/println "current namespace (abk):" msg)
(clojure.core/println "abionic namespace:" abionic/msg)

(clojure.core/refer (quote clojure.core))
(println ">>>>> clojure core refer || println wouldn't have worked before refer")
(def plus (+ 3 7))
(println plus)

; tail recursion [end-of-function recursion drop calling func frame optimization]
(println ">>>>> tail recursion")
(def showUpto100
  (fn [num]
    (print num " ")
    (if (< num 100)
      (recur (+ num 1))
      )
    )
  )
(println (showUpto100 97))
; loop
(println ">>>>> loop")
(loop [idx 5]
  (print idx " ")
  (if (< idx 15)
    (recur (+ idx 10))
    )
  )
(println)

; Macros
(println ">>>>> using Macros in-built")
(defn mul [n1 n2] (* n1 n2)) ; => (def mul (fn [n1 n2] (* n1 n2)))
(println (mul 5 10))
;(println ">>>>> creating Macros")
;(defmacro name [parameter*] expression*)

; sequence  first,rest
;
;(def lst1 (1 2 3 4 5))
;(println (first lst1)
;
;(loop [l1 (1 2 3 4 5)]
;  (print (first l1))
;  if( (< 2 1)
;  (recur (rest l1)) )
;  )
