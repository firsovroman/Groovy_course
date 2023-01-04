package lesson13

class ListRunner {

    static void main(String[] args) {

        ArrayList<Integer> list = [1, 2, 3, 4, 5, 6]


        // считывание данных
        assert list[2] == 3
        assert list.get(2) == 3
        assert list[-1] == 6 // list.get(list.size() - 1)
        assert list[1..3] == [2, 3 ,4]
        assert list[8] == null // при обращении к несуществующему элементу исключнения не будет, вернется null

        // записываем значения в лист
        list +=9
        assert list == [1, 2, 3, 4, 5, 6, 9]

        list << 11 << 11 // добавление в конец
        assert list == [1, 2, 3, 4, 5, 6, 9, 11, 11]

        list -= 11 // удаляться все элементы со значением 11
        assert list == [1, 2, 3, 4, 5, 6, 9]

        list -= [1, 3] // удаляться все элементы равные либо 1 либо 3
        assert list == [2, 4, 5, 6, 9]

        list *=2
        assert list == [2, 4, 5, 6, 9, 2, 4, 5, 6, 9]

        // методы из queue
        list.push(99)

        assert list.pop() == 99
        assert list.head() == 2
        assert list.tail() == [4, 5, 6, 9, 2, 4, 5, 6, 9]  // хвост это все без head
        assert list.last() == 9

        // flatten, reverse, intersect, disjoint
        assert [1, 2, [4, 6, 7], 9].flatten() == [1, 2, 4, 6, 7, 9]

        assert [1, 2, 3].reverse() == [3, 2, 1]

        assert [1, 2, 3].intersect([2, 3, 7]) == [2, 3]

        assert [1, 2, 3].disjoint([5, 6, 7]) // true

        // новые операторы
        def (a, b, c) = [3, 5, 7, 9, 10]
        assert a == 3
        assert b == 5
        assert c == 7


        func(*[8, 10]) //  spread-оператор раскладывает массив по переменным


    }


    static def func(def a, def b) {
        println a
        println b
    }


}
