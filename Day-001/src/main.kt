import com.rsk.Person

fun main(args: Array<String>) {
    //Chater 1
/*    println("Hello World")

    var onur=Person("Onur");

    println("Name is ${onur.Name}")

    onur.display();

    onur.displayWithLambda { ::printName }*/

    var q = Question()
    q = Question()

    
    q.Answer = "42"

    q.display()

    println("the answer to the question ${q.Question} is ${q.Answer}")

    var message = if (q.Answer == q.CorrectAnswer) {
        "you were correct"
    } else {
        "Try again"
    }

    println(message)
}

class Question {
    var Answer: String = ""
    val CorrectAnswer = "42"
    val Question: String = "blablabla......"

    fun display() {
        println("You said $Answer")
    }

}

/*
fun printName(name:String){
    println(name)
}*/
