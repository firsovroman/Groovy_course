package lesson7


/**
 *  " "
 *  ' '  - можно использовать двойные кавычки не экранируя их , но не работает ($var) string interpolation
 *  """ """   - можно вместо /n пользоваться обычным переносом строки
 *  ''' '''   - можно не экранировать двойные кавычки
 *  //        - можно не экранировать одинарные кавычки
 *  $/ $/     - можно не экранировать доллар, например для regExp
 *
 */


def name = 'Ivan';


def value = 'Hello "World" '
    println(value)


def stringValue = "Hello $name"
    println(stringValue)


def value2 = """ 
SELECT *
FROM
table WHERE name = $name
 """
    println(value2)

def value3 = """ 
SELECT *
FROM
table WHERE name = ${getWithPrefix(name)}
 """
    println(value3)

def value6 = /Hello world $name/
println(value6)

def value7 = $/Hello world $name/$
println(value7)


println "2 - " + name[2]
println "-1 - " + name[-1]
println "1..3 - " + name[1..3]
println "*3 - " + name * 3
println name - 'Iv'
println name - 'an'




def getWithPrefix(String name) {
    return  "Mr. $name"
}