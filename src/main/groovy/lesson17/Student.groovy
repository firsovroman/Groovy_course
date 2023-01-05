package lesson17

import groovy.transform.ToString
import groovy.transform.TupleConstructor

@TupleConstructor
@ToString
class Student implements WithId{

    String firstName
    String lastName
    Integer age

    def getAt(Integer index) {
        if (index == 0) {
            return firstName
        }
        if (index == 1) {
            return lastName
        }
        if (index == 2) {
            return age
        }

    }

}