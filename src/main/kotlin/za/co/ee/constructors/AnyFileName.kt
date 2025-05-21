package za.co.ee.constructors

// Define a function in any file
fun sayHelloTo(name: String) {
    println("Hello, $name!")
}

// Single expression function
fun sayHelloToAnyone() = sayHelloTo("Anyone")

// My Public class can be in any file
// name is defined and a immutable public member of the class
// surname is defined and a parameter, that is not available outside of the constructor
// age is defined as a mutable public member of the class
class AnyClassName(val name: String, surname: String = "AnySurname", var age: Int = 0) {

    fun sayHello() = sayHelloTo(name)

    fun whatsMyAgeAndName(): String {
        return "My name is $name, I'm $age years old"
    }


}
