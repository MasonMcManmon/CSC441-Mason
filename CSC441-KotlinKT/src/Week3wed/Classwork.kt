package Week3wed
fun main() {
    println("--Step 1 - Main and Output--")
    println("CSC 441")
    println("Kotlin, First Day!")

    println("--Step 2 - val and var--")
    val course = "CSC 441"
    var weeknumber = 3
    weeknumber += 1

    println("Course: " + course)
    println("Week number: " + weeknumber)

    println("--Step 3 - The Four Basic Types--")

    val name = "Mason"
    val age: Int = 21
    val gpa = 3.75
    val teaching = false

    println("Name: " + name)
    println("Age: " + age)
    println("Gpa: " + gpa)
    println("Teaching: " + teaching)

    println("--Step 4 - String Template--")
    println("$name is not Teaching $course")
//    println(name + " is not Teaching " + course)
    println("Next Year: ${age + 1}")
    println("Name Length: ${name.length} Letters")

    println("--Step 5 - Reading input--")
    print("What's your name?")
    val yourName = readlnOrNull()
    println("Hello, $yourName")

}