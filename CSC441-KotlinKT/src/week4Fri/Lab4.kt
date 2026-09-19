package week4Fri

fun main() {
    println("--Step 1--")
    val name: String = "Mason"
    val middleName: String? = null
//  val middleName: String? = "Jeff"

    println(name.length)
    println(middleName?.length)

    println("--Step 2--")
    println(middleName?.length)

    println("--Step 3--")
    println(middleName?.length ?: 0)

    println("--Step 4--")
    middleName?.let {
        println("Middle Name is: $it")
    }
    println("--Step 5--")
    val isItANum = "Popcorn".toIntOrNull()
    println(isItANum ?: "That was not a number.")

    println("--Step 6--")
    val itemList = listOf("Pen", "Notebook", "Laptop", "Charger")
    println(itemList)

    println("--Step 7--")
    val groceriesList = mutableListOf("Truck", "Car", "Bed", "Go-cart")
    groceriesList.add("Snowmobile")
    groceriesList.remove("Bed")
    println(groceriesList)
    println(groceriesList.size)

    println("--Step 8--")
    val listOfNumbers = listOf(800, 1, 76, 94, 100)
    println(listOfNumbers.sum())
    println(listOfNumbers.average())
    println(listOfNumbers.filter { it >= 100 })

}