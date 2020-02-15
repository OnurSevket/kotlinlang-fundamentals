package basictypes

fun main() {
    val name: String? = null
    val age: Int? = null

    val number1: Int? = null
    val number2: Int? = null

    var result: Int? = 0


    //result = number1!! + number2!!

    val numberTest = number1?.toLong()

    println(numberTest)

}