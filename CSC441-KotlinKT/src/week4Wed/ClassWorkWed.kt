package week4Wed

fun main() {
    println("--Step 1: Function returning nothing--")
    println(todaysExercise())

    println("--Step 2: Function returning a value--")
    println(todaysExercise1())

    println("--Step 3: a parameter--")
    println(todaysExercise2(3))
    println(todaysExercise2(dayNumber = 9))

    println("--Step 4: the short form")
    println(todaysExercise3(dayNumber = 3))

    println("--Step 5: a defualt value")
    println(todaysExercise4())
    println(todaysExercise4(dayNumber = 2))

    println("--Step 6: 2 parameters--")
    println(todaysExercise5(dayNumber = 2, name = "Mason"))
    println(todaysExercise5(name = "sam"))

}
fun todaysExercise () {
    println("Push-ups")
}

fun todaysExercise1(): String {
    return "Push-ups"
}

fun todaysExercise2(dayNumber: Int): String {
    return when (dayNumber) {
        1 -> "Push-ups"
        2 -> "Running"
        3 -> "Swimming"
        4 -> "Cycling"
        5 -> "Gym"
        else -> "Rest Day"
    }
}
fun todaysExercise3(dayNumber: Int = 1): String = when (dayNumber) {
    1 -> "Push-ups"
    2 -> "Running"
    3 -> "Swimming"
    4 -> "Cycling"
    5 -> "Gym"
    else -> "Rest Day"
}

fun todaysExercise4(dayNumber: Int = 1): String = when (dayNumber) {
    1 -> "Push-ups"
    2 -> "Running"
    3 -> "Swimming"
    4 -> "Cycling"
    5 -> "Gym"
    else -> "Rest Day"
}

fun todaysExercise5(dayNumber: Int = 1, name: String = "you"): String {
    val exercise = when (dayNumber) {
        1 -> "Push-ups"
        2 -> "Running"
        3 -> "Swimming"
        4 -> "Cycling"
        5 -> "Gym"
        else -> "Rest Day"
    }
    return "$name is $exercise"
}
