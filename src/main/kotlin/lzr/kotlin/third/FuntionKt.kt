package lzr.kotlin.third

const val FINAL_HELLO_WORLD: String = "Hello World"//常量加了const就是编译期常量
val FINAL_HELLO_WORLD_YUN = "ABC"//运行时常量
var helloWorld = FINAL_HELLO_WORLD//后面没有声明类型 是因为类型推导
val arrayInt = arrayOf(1, 7, 3, 10, 50, 6)


fun main(args: Array<String>) {
    showToast("Hello ${args[0]}")
    println("======打印传入的Args参数=======")
    checkArgs(args)
    val args11 = args[0].toInt()
    val args22 = args[1].toInt()
    println("$args11 + $args22 = ${sum(args11, args22)}")
    println("======打印传入的Args参数之和=======")
    val size = arrayInt.size - 1

    var count = 0
    for (i in 0..size) {
        count += arrayInt[i]
        println(sum(i, i))
        println(svv(i, i))
        println(sumVal(arrayInt[i], arrayInt[i]))
        println(sumLa(arrayInt[i], arrayInt[i]))//跟匿名函数调用一样
    }

    println("数组总和为 $count")
    println("======打印传入的相加函数=======")
    //当参数 foreach 跟 println的参数一致 且返回值也一样可以用 ：：表示
    arrayInt.forEach(::println)
    println("======打印传入的ArrayInt的每个值=======")
    // 这里会终止整个mian函数因为是Lambda表达式中
//    arrayInt.forEach {
//        if (it == 10) return
//        println(it)
//    }
    //加个 ForEach@标记才会跳过那个循环继续后面循环
    arrayInt.forEach ForEach@{
        if (it == 10) return@ForEach
        println(it)
    }
    println("The End")
    println("======打印传入的测试跳出循环=======")
    println(sumVal)//打印出是第几种方法 最多 funtion 22 表示最多传入22个参数 最少0个即 funtion0
    println(sayHi)//最少0个即 funtion0
}

//( Array<String>)->Unit
fun checkArgs(args: Array<String>) {
    if (args.size < 2) {
        println("请输入2位以上的数据")
        System.exit(0)
    }
}

//没有返回值就是返回Unit 相当于java的void
//返回unit的时候可以省略
//(String)->Unit
fun showToast(str: String): Unit {
    println(str)
}

//有返回值的函数
//(Int,Int)->Int
fun sum(args1: Int, args2: Int): Int {
    return args1 + args2
}

//上面函数可以缩写成
fun svv(args1: Int, args2: Int) = args1 + args2

//更进一步缩写成 函数没有名字但要赋值给变量 匿名函数
val sumVal = fun(args1: Int, args2: Int) = args1 + args2

//lambda表达式 也是匿名函数 依次是变量名  参数 最后是方法体 大括号包
val sumLa = { args1: Int, args2: Int ->
    //最后一行是lambda的返回值，中间可以有其他内容
    args1 + args2
}

//没有参数的Lambda表达式 因为没有参数 -> 也可以省略
//()->Unit
val sayHi = { println("Hello") }