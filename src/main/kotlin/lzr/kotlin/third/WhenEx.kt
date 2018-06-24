package lzr.kotlin.third

fun main(args: Array<String>) {
    val x = 5
    //when条件语句满足一个条件就自动会break
    when (x) {
        is Int -> println("属于int类型")
        in 1..100 -> println("在1到100范围内")
        !in 20..50 -> println("不在20到50范围内")
    }
    //when表达式
    val model = when {
        args.isNotEmpty() && args[0] == "1" -> 1
        else -> 0
    }

    println(model)
}