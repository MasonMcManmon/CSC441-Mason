package Week3wed

fun main() {

    println("--Step 1--")

    val name = "Mason"
    val major = "Computer Science"
    val favFood = "Pizza"

    println("Name: $name")
    println("Major: $major")
    println("Favorite Food: $favFood")


    println("--Step 2--")

    var numCourses = 34
    println("Number of Course: $numCourses")
    println("Number Courses after this one: ${numCourses + 1}")

    println("--Step 3--")

    val age = 21
    val joke = "What did 0 say to 8? ... Nice belt"
    val temp = 75.6
    val student = true

    println("Age: $age")
    println("Joke: $joke")
    println("Temp: $temp")
    println("Student: $student")

    println("--Step 4--")

    println("$name is studying $major")
    println("When I graduate i will have completed ${numCourses + 6} courses")
    println("$name is ${name.length} characters long")

    println("--Step 5--")
    print("What city are you from? ")
    val city = readlnOrNull()
    println("$city is a good city")

}