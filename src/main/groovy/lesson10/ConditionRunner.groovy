package lesson10

class ConditionRunner {


    /**
     * boolean          is true
     * Collection/Map   is not empty
     * Matcher          has match
     * String/GString   is not empty
     * Number/Char      != 0
     * reference        != null
     *
     * @param args
     */

    static void main(String[] args) {


        int x = 0

        if (x) {
            println(x)
        }


        def person = new Person(9);

        if(person) {
            println "is it true $person"
        } else {
            println "is it false $person"
        }




        //elvis operator

//        def result = x != null ? x : 1
//        def result = x ? x : 1
        // если функция x.asBoolean() возвращает true тогда вернется объект x иначе какое то дефолтное значение (типа 1)
        def result = x ?: 1
        println result

    }


}
