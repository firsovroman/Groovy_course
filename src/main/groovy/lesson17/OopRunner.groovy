package lesson17

class OopRunner {

    static void main(String[] args) {
        def student = new Student();
        student.firstName = "Ivan" // setFirstName
        println student.firstName  // getFirstName
        println student['firstName']
        println student.'firstName'
        println student.@firstName  // not recommended

        def student2 = new Student(firstName: "Petr", lastName: "Petrov", age: 20, id:1)

        student2.validateId() // метод добавленный с помощью Trait

        println "======================="

        println student2

        student2.properties.each {println it}

        println "======================="

        Student student3 = ['Max', 'Maximov', 30]
        println student3


        def(fn, ln) = student3
        println fn
        println ln

        List<String> names = [student, student2].collect() {it.firstName}
        assert names == ["Ivan", "Petr"]
        assert [student, student2].firstName == ["Ivan", "Petr"]


        // RuntimeMixin добавить метод printStr() написанный в текущем классе, всему классу String (не только одному объекту)
        // с помощью mixin()
        String.mixin(OopRunner.class)

        "Vladimir".printStr()
    }

    static def printStr(String self) {
        println "It's mixin $self"
    }

}
