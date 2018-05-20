import java.util.*;

fun main(args: Array<String>) {

    printStuff(sum(1, 2).toString())

    println(sum(1, 2))

    val a = 2
    printStuff(a.toString())
/*
array
 */
    val items = listOf(1, 2, 3, 4)
    /*
    for each loop
     */
    for (item in items)
        println(item)

}

fun printStuff(a: String) {
    println(a)
}

fun sum(a: Int, b: Int) = a + b


fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }

class InitOrderDemo(name: String){
    val firstProperty= "First property: $name".also(::print)

}

var a = 0;
var head = Node()


class Node() {
    val root: Int? = null
    val left: Node? = null
    val right: Node? = null
}
