fun main() {
    print("Enter Number: ")
    val number = readln()!!.toInt()

    println("By Normal Recursion, Factorial of $number = ${factorialNormal(number)}")
    println("By TailRec Keyword, Factorial of $number = ${factorialTailRec(number)}")
}

fun factorialNormal(n: Int): Int {
    if (n == 0) {
        return 1
    } else {
        return n * factorialNormal(n - 1)
    }
}


tailrec fun factorialTailRec(n: Int, acc: Int = 1): Int {
    return if (n == 0) {
        acc
    } else {
        factorialTailRec(n - 1, n * acc)
    }
}


