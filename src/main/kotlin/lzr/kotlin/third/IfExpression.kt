package lzr.kotlin.third

private const val USER_NAME = "lzr"
private const val PASSWORLD = "123456"

private const val USER_NAME_ADMIN = "admin"
private const val PASSWORLD_ADMIN = "admin"

private const val MODEL_USER = 0
private const val MODEL_ADMIN = 1

fun main(args: Array<String>) {
    println("请输入账户类型（1或者0）：")
    val inputModel = readLine()
    //if表达式  必须有 else
    val mode = if (inputModel == "1") {
        MODEL_ADMIN
    } else {
        MODEL_USER
    }
    println("请输入账号：")
    val userName = readLine()
    println("请输入密码：")
    val pwd = readLine()
    if (mode === MODEL_ADMIN && userName == USER_NAME_ADMIN && pwd == PASSWORLD_ADMIN) {
        println("管理员登录成功")
    } else if (mode === MODEL_USER && userName == USER_NAME && pwd == PASSWORLD) {
        println("用户登录成功")
    } else {
        println("登录失败，账号或密码错误")
    }

}