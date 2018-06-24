package lzr.kotlin.third

fun main(args: Array<String>) {

    //只要被迭代对象有 迭代器 并返回迭代对象就可以被迭代
    for (args in args) {
        if (args == "b") continue //跳过这层循环
        println(args)
        if (args == "c"){
            break//终止所有循环
        }
    }

    for ((index, value) in args.withIndex()) {
        println("$index ---> $value")
    }

    val homeList = HomeList()
    homeList.add(5)
    homeList.add(7)
    homeList.add(4)
    homeList.add(10)

    for (i in homeList){
        println("$i")
    }

}

//自定义迭代类型
class HomeIterator(val iterator: Iterator<Int>) {
    operator fun next(): Int {
        return iterator.next()
    }

    operator fun hasNext(): Boolean {
        return iterator.hasNext()
    }
}

class HomeList{
    private val list = ArrayList<Int>()


    fun add(int: Int){
        list.add(int)
    }

    operator fun iterator():HomeIterator{
        return HomeIterator(list.iterator())
    }
}