fun factorial(n: Int): Int {
    return if (n == 0 || n == 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}

fun main() {
    val number = 5
    val result = factorial(number)

    println("Factorial of $number is $result")
}
