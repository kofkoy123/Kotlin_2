package lzr.kotlin.third

//变长参数写法 跟args: Array<String> 一样的
fun main(vararg args: String) {
    //具名参数指定参数的值，所以参数位置可以变化
    println(summ(arg2 = 5, arg1 = 1))

    println(summ(1, 5))
    println("======分割线=======")
    //因为有具名参数在所以变长参数可以放弃任意位置
    sayHi(3.0, 1, 5, 3, 6, 7, string = "vvvv")
    println("======分割线=======")
    val ints = intArrayOf(12, 56, 32, 65)
    sayHi(5.0, *ints, string = "sya")
    println("======默认参数=======")
    //在默认参数中，如果变长参数放第一位就要用具名参数声明
    sayHi(ints = *ints, string = "sya")
}


fun sayHi(double: Double = 3.0, vararg ints: Int, string: String) {
    println(double)
    ints.forEach(::println)
    println(string)

}

fun summ(arg1: Int, arg2: Int): String {
    return "$arg1 + $arg2 = ${arg1 + arg2}"
}