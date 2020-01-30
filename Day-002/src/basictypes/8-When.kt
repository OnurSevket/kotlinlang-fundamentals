package basictypes

fun main() {
    val countryCode = readLine()!!
    when (countryCode.toLowerCase()) {
        "tr" -> println("Tc Vatandaşı")
        "fr" -> println("fr Vatandaşı")
        "de" -> println("de Vatandaşı")
        "usa" -> println("usa Vatandaşı")
        "ru" -> println("ru Vatandaşı")
        "uk" -> println("uk Vatandaşı")
    }

    when (countryCode.toLowerCase()) {
        "tr", "az" -> println("Türki Vatandaşı")
        "fr" -> println("fr Vatandaşı")
        "de" -> println("de Vatandaşı")
        "usa" -> println("usa Vatandaşı")
        "ru" -> println("ru Vatandaşı")
        "uk" -> println("uk Vatandaşı")
    }


    val expWhenSample = when (countryCode.toLowerCase()) {
        "tr" -> println("Tc Vatandaşı")
        "fr" -> println("fr Vatandaşı")
        "de" -> println("de Vatandaşı")
        "usa" -> println("usa Vatandaşı")
        "ru" -> println("ru Vatandaşı")
        "uk" -> println("uk Vatandaşı")
        else -> println("Undefined")
    }

    val phoneNumber = 5318928928
    when (phoneNumber) {
        is Long -> {
            println("Long Value")
        }
    }



}