package lesson5

import groovy.transform.CompileStatic

import java.sql.Date as SqlDate // алиас для разруливания коллизии имен зависимостей

class VariablesRunner {

    // groovy динамический язык программирования проверка синтаксиса происходит в рантайме
    // для проверки на этапе компиляции можно использовать аннотацию
    @CompileStatic
    static void main(String[] args) {

        // int == Integer примитивов нет
        int value = 5
        println(value.toString())

        new Date()
        new SqlDate(2022, 12, 12)
    }

}
