package lesson24

import lesson17.Student

class CategoryRunner {

    static void main(String[] args) {
        Student student = new Student(age: 18, firstName: "Ivan")

        // используем метод из класса DefaultStudentMethods на объекте student ( в области видимости Closure замыкания)
        use(DefaultStudentMethods.class) {
            student.testStr()
            student.anotherMethod("arguments")
        }
        // по сути в методе "use()" происходит добавление всех методов из Category класса в metaClass всех
        // объектов внутри блока Closure.
        // После выхода из блока Closure - удаляются из metaClass


        // полетит исключение иди вызовется missing method
        student.testStr()



    }

}
