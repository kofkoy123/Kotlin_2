package lzr.kotlin.third

class Complex(var agr1: Double, var agr2: Double) {

    //重写加号的运算方法  传入参数必须个数相同 类型可不同 返回值可以不一样
    operator fun plus(other: Complex): Complex {
        return Complex(agr1 + other.agr1, agr2 + other.agr2)
    }

    operator fun plus(other: Int): Int {
        return (agr1 + agr2 + other).toInt()
    }

    override fun toString(): String {
        return "Complex(agr1=$agr1, agr2=$agr2)"
    }

    fun add(): Double {
        return agr1 + agr2
    }
}

class Book {
    //中缀表达式 可以对象调用该方法不用带. 但这样的话难以阅读
    //如果只有1个参数就可以用
    infix fun on(any: Any): Boolean {
        return false
    }
}

class Kotlin


fun main(args: Array<String>) {
    val c1 = Complex(3.0, 4.0)
    val c2 = Complex(5.0, 8.0)
    println(c1 + c2)
    println(c1 + 10)
    println((c1 + c2).add())
    println("======分割线=======")
    if ("-name" in args) {
        println(args[args.indexOf("-name") + 1])
    }
    println("======分割线=======")
    val book = Book()
    val kotlin = Kotlin()
    println(book on kotlin)

}