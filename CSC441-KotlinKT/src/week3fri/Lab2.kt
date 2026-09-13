package week3fri

fun main() {
    for (i in 1..10) {
        print("$i ")
    }
    println()

    for (i in 20 downTo 1 step 3) {
        print("$i ")
    }
    println()

    val tripitems = mutableListOf<String>("Passport", "Charger", "Headphones", "Toothbrush")
    for (item in tripitems) {
        println("$item ")
    }
    println()

    tripitems.forEachIndexed { index, item ->
        println("$index is $item")
    }
    println()

    for (i in 0 until tripitems.size) {
        println("$i: ${tripitems[i]}")
    }
    println()

    print("What Day of the Week is it?(1-7): ")
    val day = readln()

    when (day) {
        "1" -> println("Monday")
        "2" -> println("Tuesday")
        "3" -> println("Wednesday")
        "4" -> println("Thursday")
        "5" -> println("Friday")
        "6" -> println("Saturday")
        "7" -> println("Sunday")
        else -> println("Not a day of the week")
    }
    println()


    val day2 = 3

    when (day2) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Not a day of the week")
    }





    var budget = 3654
    print("What's the new added cost to the budget?(Budget: $budget/5000): ")
    val addCost = readln ().toInt()

    budget += addCost

    val IamOverBudget = when (budget) {
        in 1..5000 -> "I am under budget"
        else -> "I am over budget"
    }
    println("$IamOverBudget: $budget")

}


