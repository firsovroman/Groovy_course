package lesson16

import lesson10.Person

class IteratesRunner {

    /**
     *
     * DefaultGroovyMethods
     *
     * @param args
     */

    static void main(String[] args) {

        assert [1, 4, 7, 9].any {it % 2 == 0}
        assert [1, 4, 7, 9].find {it % 2 == 0} == 4
        assert [1, 4, 7, 9].findAll {it % 2 != 0} == [1, 7, 9]
        assert (2..4).collect() == [2, 3, 4]

        def person = new Person(25)
        person.each {println it}

        assert ["asd", "dsf", "12", "546", "234df"].grep(~/\d+/) == ["12", "546"]            // isCase (метод возвращающий  boolean)
        assert ["asd", "dsf", "12", "546", "234df"].grep { it.length() > 4 } == ["234df"]    // isCase (метод возвращающий  boolean)
    }

}
