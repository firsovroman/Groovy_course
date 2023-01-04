package lesson15

class RangesRunner {

    static void main(String[] args) {

//        IntRange range = 2..8
        IntRange range = 2..<8 // не включая 8-ку

        assert range.get(3) == 5
        assert range.contains(7)
        assert !range.contains(8)

        range.each {println it}


        ('a'..'d').each {println it} // рендж символов

        (WeekDay.MO..WeekDay.FR).each {println it} // рендж объектов

        (WeekDay.FR..WeekDay.MO).each {println it}  // можно в обратном порядке

    }

}
