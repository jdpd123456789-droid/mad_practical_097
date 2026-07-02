fun main(){
    // User-Defined Function: Create a user-defined function to perform arithmetic operations (addition, subtraction, multiplication, division) on two numbers
    print("Enter Number 1 : ")
    val number1 = readln().toInt()
    print("Enter Number 2 : ")
    val number2 = readln().toInt()
    println(add(number1, number2))
    println(subtract(number1, number2))
    println(multiply(number1, number2))
    println(divide(number1, number2))

}
fun add(number1: Int, number2: Int): Int {
    return number1 + number2
}
fun subtract(number1: Int, number2: Int): Int {
    return number1 - number2
}
fun multiply(number1: Int, number2: Int): Int {
    return number1 * number2
}
fun divide(number1: Int, number2: Int): Int {
    return number1 / number2
}