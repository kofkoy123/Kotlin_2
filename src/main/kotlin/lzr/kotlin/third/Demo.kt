package lzr.kotlin.third

import java.text.BreakIterator
import java.util.concurrent.ExecutionException

fun main(args: Array<String>) {
    while (true) {
        try {
            println("请输入算式比如：3 + 5，请以空格分隔")
            val input = readLine() ?: break//如果为null跳出循环
            val splits = input.trim().split(" ")
            if (splits.size < 3) {
                throw IllegalAccessException()
            }
            val arg1 = splits[0].toDouble()
            val op = splits[1]
            val arg2 = splits[2].toDouble()
            println("计算结果：$arg1 $op $arg2 = ${Operation(op).apply(arg1, arg2)}")
        } catch (e: NumberFormatException) {
            println("你确定输入的是数字吗？")
        } catch (e: IllegalAccessException) {
            println("你确定输入三个字符串，或空格分开吗？")
        } catch (e: Exception) {
            println("遇到未知异常${e.message}")
        }
        println("需要继续使用吗？[Y]/[N]")
        val result = readLine()
        if (result == null || result.toLowerCase() != "y") {
            break//输入继续
        }
    }
    println("感谢您使用我们的计算器")
}


class Operation(op: String) {
    val opFun: (left: Double, right: Double) -> Double

    init {
        opFun = when (op) {
            "+" -> { l, f -> l + f }
            "-" -> { l, f -> l - f }
            "*" -> { l, f -> l * f }
            "/" -> { l, f -> l / f }
            "%" -> { l, f -> l % f }
            else -> {
                throw UninitializedPropertyAccessException(op)
            }
        }
    }

    fun apply(left: Double, right: Double): Double {
        return opFun(left, right)
    }
}