package lzr.kotlin.third


class Person {

}

class Man {
    //延迟赋值 下面三种都属于延迟赋值 都有可能为null 最后在构造函数就赋值
    lateinit var name: String
    lateinit var person: Person
    val personTwo: Person by lazy {
        Person()
    }
    var b = 0
        get() {
            println("获取B的值")
            return field
        }
        set(value) {
            println("设置B的值·")
            field = value
        }
    var d = 0
        get() {
            println("获取D的值")
            return field
        }
        set(value) {
            println("设置D的值·")
            field = value

        }
}

//前面有var或者val的才是类的属性，没有修饰的只能作为构造方法的参数，不能类.来调用
class Wuman(var age: Int, val waimao: String, xingge: String) {
    var xg = xingge
}


fun main(args: Array<String>) {
    val man = Man()
    man.b = 1
    var c = man.b
    println(c)
    man.d = 3
    var dd = man.d
    println(dd)
    println("======分割线=======")

    man.person = Person()
    println(man.person)
    println(man.personTwo)
    //因为这里没有赋值会出错
//    println(man.name)
    println("======分割线=======")
    val wuman = Wuman(20, "漂亮", "温柔")
    println(wuman.age)
    println(wuman.waimao)
    println(wuman.xg)


}



