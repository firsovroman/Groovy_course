package lesson27

import static lesson27.DslBuilder.*

//    def email = new Email()
//    email.setFrom("from@mail.ru")
//    email.setTo("to@mail.ru")
//    email.setTitle("title")
//
//    def body = new EmailBody()
//    body.setText("text of the letter")
//    body.setImages(List.of(['image.jpg', 'image2.jpg']))
//
//    email.setBody(body)


// Вместо написания кода выше можно использовать более понятный формат записи (DSL) :
// pattern builder
    mail {
        from "from@mail.ru"
        to "to@mail.ru"
        title "title"
        body {
            text "text of the letter"
            images (['image.jpg', 'image2.jpg'])
            image "image3.jpeg"
        }
    }