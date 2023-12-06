fun main(args: Array<String>) {

    // val - variabel som man inte får ändra / konstant
    val name : String = "David"
    val number = 3
    val number2 : Int
    number2 = 4

    // var - variabel som får ändra värde
    var a = 7
    a = 9


    var personName : String? // ? betyder att variabel kan innehålla null
    personName = null
    personName = "Susan"

    val c = sum(3, 7)
    println("Summan är ${c}!")

    val p1 = Person("David", 44)
    println(p1.age)
    val p2 = Person("Susan")
    println(p2.age)


    val names = mutableListOf<String>()
    names.add("Susan")
    names.add("Lois")
    names.add("Laura")

    for( name in names) {
        println("Name: ${name}")
    }
}

fun sum(a : Int, b : Int) : Int {
    return a + b
}

// Vi deklarerar ny class som heter Person.
// I den klassen finns det en variabel name som är String och age som är Int
// Vi kan ange default värde i kontruktorn, då behöver vi inte skicka värdet till det
class Person(var name: String, var age : Int = 0) {
    // Man kan också ha instansvariabler som man inte tar in i kontruktorn, då anger man default-värde
    var email : String = "@"

}