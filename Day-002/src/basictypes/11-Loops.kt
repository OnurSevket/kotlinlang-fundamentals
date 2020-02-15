package basictypes

fun main() {

    for (value in 10..100) {
        print("$value")
    }

    println()
    val countryCodeArray = arrayOf("tr", "an", "az", "fr")

    for (value in countryCodeArray) {
        print("$value ")
    }

    println()
    for ((index, value) in countryCodeArray.withIndex()) {

        println("$index . değeri : $value")

    }
    repeat(5) {
        print("\n Mobile Developer olacağım")
    }

}