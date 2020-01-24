package basictypes

fun main() {
    val studentNumber = arrayOf(12, 23, 34, 45, 56)
    val studentNames = arrayOf("Ahmet", "Mehmet")

    val firstCharOfCountrys = CharArray(4)
    firstCharOfCountrys.set(0, 'T')


    val squareArray = Array<Int>(5) {
        it * it
    }

    println(squareArray[0].toString() + "--" + squareArray[1].toString()+ "--" +squareArray.toString())
}