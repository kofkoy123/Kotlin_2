package lzr.kotlin.third

fun main(args: Array<String>) {

    try {
        val num1 = args[0].toInt()
        val num2 = args[1].toInt()
        println("$num1 + $num2 = ${num1 + num2}")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("请输入两个整数")
    } catch (e: NumberFormatException) {
        println("请输入整数")
    } catch (e: Exception) {
        println("程序出现未知异常")
    } finally {
        println("十分感谢您使用我们的程序")
    }

    //异常捕捉表达式
    val result = try {
        args[0].toInt() / args[1].toInt()
    } catch (e: Exception) {
        e.printStackTrace()
        0
    }
    println(result)
}