package lesson12

class LoopsRunner {

    static void main(String[] args) {

        def list = [1, 2, 3, 4, 5, 6]

//        for(i in 0..<list.size()) {
//            println i
//        }
//
//        for(value in list) {
//            println value
//        }

//        0.upto(list.size()) {v ->
//            println v
//        }
//
//        list.size().downto(0) {
//            println it
//        }


        // выбираем шаг для цикла
        0.step(list.size(), 2) {
            println it
        }

    }

}
