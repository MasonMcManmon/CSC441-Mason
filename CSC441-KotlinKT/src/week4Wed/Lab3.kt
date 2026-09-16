package week4Wed

fun main () {
    println("--Step 1--")
    describeToday()
    println()

    println("--Step 2--")
    println(favouriteThing())
    println()

    println("--Step 3--")
    println(pickOne( number = 4))
    println()

    println("--Step 4--")
    println(pickOneShort(number = 2))
    println()

    println("--Step 5--")
    println(pickWithDefault())
    println(pickWithDefault(name = "Mason"))

}

fun describeToday() {
    println("It's Wednesday and I'm tired")
}

fun favouriteThing(): String {
    return "Snowmobiling is one of my favorite things to do."
}

fun pickOne (number: Int): String {
    return when (number) {
        1 -> "DirtBike"
        2 -> "Go-cart"
        3 -> "Boat"
        else -> "snowmobile"
    }
}

fun pickOneShort(number: Int): String = when (number) {
    1 -> "DirtBike"
    2 -> "Go-cart"
    3 -> "Boat"
    else -> "snowmobile"
}

fun pickWithDefault(number: Int = 1, name: String = "you"): String {
    val result = when (number) {
        1 -> "DirtBike"
        2 -> "Go-cart"
        3 -> "Boat"
        else -> "snowmobile"
    }
    return "$name is riding a $result"
}