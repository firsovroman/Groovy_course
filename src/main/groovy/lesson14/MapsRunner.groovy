package lesson14

class MapsRunner {

    static void main(String[] args) {

        // def map = [:] - инициализация пустой мап
        LinkedHashMap<String, Integer> map = ["one" : 1, "two" : 2]

        // read
        assert map.get("one") == 1
        assert map["one"] == 1
        assert map."one" == 1
        assert map.one == 1     // вызывается метод propertyMissing
        assert map.get("qwe", 10) == 10   // getOrDefault()  (добавляет в мап такой entry)

        assert map == [one:1, two:2, qwe:10]

        // write
        map.three == 3

        // new method
        assert map.subMap("one", "two") == ["one" : 1, "two" : 2]

        // new operator
        def newMap = ["q" : 22, "rt": 99, *:map] // добавляем одну мапу в другую
        assert newMap == [q:22, rt:99, one:1, two:2, qwe:10]

        println newMap

    }

}
