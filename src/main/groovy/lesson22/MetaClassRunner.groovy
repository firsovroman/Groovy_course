package lesson22

import lesson17.Student
import org.codehaus.groovy.runtime.DefaultGroovyMethods

import java.lang.reflect.Method

class MetaClassRunner {



    static void main(String[] args) {

        // воссоздадим мета-класс для примера
        CustomMetaClass customMetaClass = new CustomMetaClass()

        // получим нужный нам метод
        Method method = DefaultGroovyMethods.class.getMethod("println", Object.class, Object.class)

        // кладем его в список методов ипровизированного мета-класса
        customMetaClass.methods.put("println", method)

        //***********************************************************************

        // получим ранее положенный метод
        Method printlnMethod = customMetaClass.methods.get("println")

        Student student = new Student()

        // запустим полученный метод на объекте student
        printlnMethod.invoke(student, student, "Test2")


        // 1. MetaClassImpl

        println student.metaClass
//        println student.metaClass.methods

        // 2. ExpandoMetaClass дает возможность добавлять динамический методы и поля

        // добавить поле
        student.metaClass.abc = "Test property"

        // добавить поле типа Closure
        student.metaClass.test = {
            println "Its a new method"
        }

        // test это вроде как поле типа Closure , но мы можем использовать его как метод дописав скобки
        student.test()

        // классу добавит метод
        student.class.metaClass.newMethod = { int value ->
            println "New method in Student, have value = $value"
        }

//        student.newMethod(24)  - здесь еще нет метода нужно создать новый объект
        new Student().newMethod(24)

        println student.metaClass


        // 3. ProxyMetaClass - interceptors

    }

}
