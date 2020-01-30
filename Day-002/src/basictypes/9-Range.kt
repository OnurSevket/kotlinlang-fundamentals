package basictypes

fun main() {
    //val studentGrade: Int = readLine()!!.toInt()

    /*Range*/
    val number = 3
    when (number) {
        in 0..10 -> {
            println("Long value")
        }
        in 11..20 -> {
            println("Long Value")
        }
        !in 11..20 -> {
            println("Long Value")
        }

    }


    val numbers = 1..100
    val numbers2 = 1.rangeTo(1000)

    val alphapet = 'A'..'Z'

    val reversedNumbers = 100.downTo(1)

    val gradeNumbers = 10.until(100)

    val gradeNumbers2 = 1..100 step (2)

    val reversed2 = 100 downTo 1 step (3)

    reversed2.forEach() { print(" " + it) }

    val numberList: IntRange = 10..100
    numberList.first
    numberList.last
    numberList.step

    numberList.count {
        it > 50
    }

}