package lesson10

class ConditionRunner {


    /**
     * boolean          (is not null) && is true
     * Collection/Map   (is not null) && (is not empty)
     * Matcher          has match
     * String/GString   (is not null) && (is not empty)
     * Number/Char      != 0
     * reference        != null
     *
     * @param args
     */

    static void main(String[] args) {

        boolean b = null
        if(b) {
            println('зашли в boolean часть')
        }

        List<String> list = null
        if(list) {
            println('зашли в List часть')
        }

        String s = ''
        if (s) {
            println('зашли в строковую часть')
        }

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
