package lesson25

import lesson17.Student

class Closure2Runner {

    static void main(String[] args) {

        // как привязать эту функцию к объекту класса Student ?
        Closure closure = {
            //this
            firstName = "Bob"  // обращаемся и переопределяем проперти из класса Student
        }

        // 3 основных поля замыкания
        println closure.thisObject  // объект к которому обращаемся
        println closure.owner       // где определено замыкание
        println closure.delegate    // то же что и owner только можем изменять

        Student student = new Student("Ivan", "Ivanov", 29)
        println student


//        closure.delegate = student  // все запросы которые приходят к closure делегируются к student
//        closure.resolveStrategy = Closure.DELEGATE_FIRST // переменная firstName будет искаться в delegate в первую очередь
//        closure()

        student.with closure // то же самое что три строки выше но одной строкой

        println student

    }

}
