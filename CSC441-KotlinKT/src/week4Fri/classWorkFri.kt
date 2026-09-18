package week4Fri

fun main() {
    println("--Step 1: Two kinds of String--")
    val firstName: String = "Mason"
    val middleName: String? = null

    println(firstName.length)
    println(middleName?.length)
    println()

    println("--Step 2: Safe Call--")
    println(middleName?.length)

    println("--Step 3: Elvis--")
    println(middleName?.length ?: 0)
    println()

    println("--Step 4: Let--")
    middleName?.let {
        println("Middle name is: $it")
    }
    println()

    println("--Step 5: The Risky One--")
    val maybeNumber: Int? = 100
    println(maybeNumber!! + 1)      //Possible but not ideal
    println()

    println("--Step 6: Where nulls actually come from--")
    val notANumber = "Banana".toIntOrNull()
    println(notANumber ?: "That wasnt a number")

    val capitals = mapOf("France" to "Paris", "Japan" to "Tokyo")
    println(capitals["Canada"] ?: "Not in the map")

    val emptyList = listOf<Int>()
    println(emptyList.maxOrNull() ?: "Empty List")

    println()

    println("--Step 7: List and MutableList")
    val shoppingList = listOf("Bread", "Butter", "Water")
    val toDoList = mutableListOf("Homework", "Laundry")

    toDoList.add("Dishes")
    toDoList.remove("Laundry")

    println(shoppingList)
    println(toDoList)
    println("Items: ${toDoList.size}")

//    shoppingList.add("Milk") -- cant do not mutableList
    println()

    println("--Step 8: Thing List cant do--")

    val scores = listOf(90, 72, 85, 64, 98)
    println(scores.sum())
    println(scores.average())
    println(scores.maxOrNull())
    println(scores.sorted())
    println(scores.filter { it >= 80})
}