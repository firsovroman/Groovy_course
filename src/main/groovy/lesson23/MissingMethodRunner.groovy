package lesson23

import lesson17.Student

class MissingMethodRunner {

    static void main(String[] args) {
        def student = new Student()

        student.test()          // метода нет в классе
        println student.abc     // поля нет в классе


        // тот же механизм используется в мапе когда мы обращаемся как бы к полю но значение подставляется в метод get() в качестве ключа
        LinkedHashMap<String, Integer> map = ["1":11, "2":22]
        println map."1"  // map.get()
    }

}
