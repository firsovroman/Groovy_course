package lesson6

class VariableOperatorsRunner {

    static void main(String[] args) {

        assert 1 + 2 == 3
        assert 4 - 3 == 1
        assert 3 * 5 == 15
        assert 3 / 2 == 1.5
        assert 3.intdiv(2) == 1
        assert 10 % 3 == 1
        assert 2**3 == 8

        def result = (3 / 2) as Integer  // приведение вместо джававского (int) (3 / 2)


        println(result <= 29)
        println(result === Integer.valueOf(1)) // true (потому что объект не создается а берется из кеша)
        println(result * 130 === 130) // false  (создается новый объект ссылки не совпадут (потому что больше 128))
        println(result <=> 138) // compare to (-1, 0 , 1)
    }


}
