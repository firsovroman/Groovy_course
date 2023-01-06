package lesson24

import lesson17.Student

@Category(Student.class)
class DefaultStudentMethods {

    def testStr() {
        println "$age, $firstName "
    }




    static def anotherMethod(Student self, String value) {
        println "$self, args value: $value"
    }

}
