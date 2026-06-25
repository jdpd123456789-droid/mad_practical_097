import jdk.internal.org.jline.utils.Colors.s

fun main (){
    val i = 30000
    val j = i.toDouble()
    println("Integer value =" + i)
    println("Double value =" + j)
    val s1 = "30500"
    val k = s1.toInt()
    println("Integer value =" + k)
    println("String value =" + s1)

    val d1 = "302000000000"
    val l = d1.toDouble()
    println("String value =" + d1)
    println("Double value =" + l)
}