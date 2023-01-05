package lesson17

import groovy.transform.Canonical
import groovy.transform.builder.Builder

@Canonical // TupleConstructor + ToString + EqualsAndHashCode
@Builder
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