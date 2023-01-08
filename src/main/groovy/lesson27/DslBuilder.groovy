package lesson27

class DslBuilder {

    static MailSpecification mail(@DelegatesTo(MailSpecification)  Closure closure) {
        MailSpecification mailSpecification = new MailSpecification()

        //способ 1
//        closure.delegate = mailSpecification
//        closure.resolveStrategy = Closure.DELEGATE_FIRST
//        closure()

        //способ 2
        mailSpecification.with closure // выполняем closure на пространстве переменных класса MailSpecification

        mailSpecification
    }

}
