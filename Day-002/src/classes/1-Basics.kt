package classes

class Car2 constructor(carType: String) {

}

class Car constructor(carType: String = "default value") {

//    constructor(carType: String, carColor: String) {
//
//    }
}


fun main() {
    val carInstance = Car()
    val carInstance2 = Car("bmw")
}