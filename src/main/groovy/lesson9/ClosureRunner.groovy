package lesson9

import java.util.function.Function
import java.util.stream.Stream

class ClosureRunner {


    static void main(String[] args) {

//        Function<Integer, Integer> func = value -> value + value




// замыкание без параметров пишется так
        Closure closure0 = {->
            println 123
        }

// return подставляется к последней строке
        Closure closure = { value ->
            println value
            value + value
        }

// можно не указывать входной параметр и использовать зарезервированное имя it
        Closure closure2 = {
            println it
            it + it
        }




//        def result = closure.call(5)
        def result = closure(5)
        println result

        Stream.of(1, 2, 3, 4)
            .map(closure)
            .map(String.&valueOf)
            .forEach(System.out::println);



        // можем изменять переменную определенную не внутри Closure
        int x = 10
        callClosureIfTrue (x > 0) {
            println (++x)
        }


        println x

    }

    // функция высшего порядка
    static def callClosureIfTrue(boolean condition, Closure closure) {
        if (condition) {
            closure()
        }
    }

}
