package lesson17

class OopRunner {

    static void main(String[] args) {
        def student = new Student();
        student.firstName = "Ivan" // setFirstName
        println student.firstName  // getFirstName
        println student['firstName']
        println student.'firstName'
        println student.@firstName  // not recommended

        def student2 = new Student(firstName: "Petr", lastName: "Petrov", age: 20)
        println student2

        Student student3 = ['Max', 'Maximov', 30]
        println student3


        def(fn, ln) = student3
        println fn
        println ln

        List<String> names = [student, student2].collect() {it.firstName}
        assert names == ["Ivan", "Petr"]
        assert [student, student2].firstName == ["Ivan", "Petr"]

    }

}
