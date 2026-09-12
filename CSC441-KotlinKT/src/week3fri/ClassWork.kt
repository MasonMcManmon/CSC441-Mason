package week3fri

fun main() {

    println("--Step 1--")

    for (i in 1..5) {
        print("$i ")
    }
    println()

    for (letter in 'a'..'e') {
        print("$letter ")
    }
    println()

    println("--Step 2--")

    for (i in 10 downTo 1){
        print("$i ")
    }
    println()

    for (i in 0..100 step 25) {
        print("$i ")
    }
    println()

    println("--Step 3--")

    val shoppingList = mutableListOf("Milk", "Bread", "Coffee")
    for (item in shoppingList){
        println("$item")
    }
    println()

    for ((index, item) in shoppingList.withIndex()) {
        println("$index: $item")
    }
    println()

    shoppingList.forEachIndexed { index, item ->
        println("$index is $item")
    }
    println()

    println("--Step 4--")

    for (i in 0 until shoppingList.size) {
        println("$i: ${shoppingList[i]}")
    }
    println()

    println("--Step 5--")

    val day = "Sunday"

    when (day) {
        "Monday" -> println("5 days till weekend")
        "Tuesday" -> println("4 days till weekend")
        "Wednesday" -> println("3 days till weekend")
        else -> println("weekend is close")
    }
    println()

    println("--Step 6--")

    val age = 40

    val amIOld = when (age) {
        in 1..50 -> false
        in 20..100 -> true
        else -> true
    }
    println(amIOld)

    println()

    println("--Step 7--")

    val years = 10
    val level = if (years > 20) "Senior" else "Junior"
    println(level)

    println()
}