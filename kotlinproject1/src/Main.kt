import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    var b = 0

    for (i in 0..a) {
        if (i % 2 == 0) {
            b = b + i
        }
    }

    println(b)
}