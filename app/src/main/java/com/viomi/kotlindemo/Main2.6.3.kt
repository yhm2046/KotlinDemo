package com.viomi.kotlindemo

fun main() {
//    2.6.3 java函数的api
    Thread{ println("最简单的写法。。。")}.start()
    Thread(Runnable { println("single writing..") }).start()
    println("----------------------------------------------------------")
    Thread(object :Runnable{
        override fun run(){
            println("running...")
        }
    }).start()
}