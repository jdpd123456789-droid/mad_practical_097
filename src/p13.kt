fun main () {
//    var s1: String? = "23"
//    val a1: Int = s1!!.toInt()
//    println(a1)
//
//    println("Enter Number: ")
//    var s2 = readln().toInt()
//    println(s2)

    print("Enter Enrollment Number: ")
    val eno = readln()

    print("Enter name: ")
    val name = readln()

    print("Enter Branch: ")
    val branch = readln()

    print("Enter class: ")
    val clas = readln()

    print("Enter Batch: ")
    val batch = readln()

    print("Enter College Name: ")
    val clg = readln()

    print("Enter University Name: ")
    val uni = readln()

    print("Enter Age: ")
    val age = readln().toInt()
    println()
    println("******************************")
    println()
    println("Student's Data:")
    println("Enrollment No.:$eno")
    println("Name: $name")
    println("Age: $age")
    println("Branch: $branch")
    println("Class: $clas")
    println("Batch: $batch")
    println("College Name: $clg")
    println("University Name: $uni")
}