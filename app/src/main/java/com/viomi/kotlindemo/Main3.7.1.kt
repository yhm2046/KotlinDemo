package com.viomi.kotlindemo

fun main() {
    //吃完所有水果并打印,demo4
    println("--------------demo4---------------------")
    val list4= listOf("apple","banana","pear")
    val result4=StringBuffer().apply{
        append("eating...\n")
        for (fruit in list4)
            append(fruit).append("\n")
        append("ate finish")
    }
    println(result4.toString())
    //吃完所有水果并打印,demo3
    println("--------------demo3---------------------")
    val list3= listOf("apple","banana","pear")
    val result3=StringBuffer().run{
        append("eating...\n")
        for (fruit in list3)
            append(fruit).append("\n")
        append("ate finish")
        toString()
    }
    println(result3)
    //吃完所有水果并打印,demo2
    println("--------------demo2---------------------")
    val list2= listOf("apple","banana","pear")
    val result2= with(StringBuffer()){
        append("eating...\n")
        for (fruit in list2)
            append(fruit).append("\n")
        append("ate finish")
        toString()
    }
    println(result2)
    println("--------------demo1---------------------")
    //吃完所有水果并打印,demo1
    val list= listOf("apple","banana","pear")
    val builder=StringBuffer()
    builder.append("eating..\n")
    for (fruit in list)
        builder.append(fruit).append("\n")
    builder.append("finish..\n")
    val result=builder.toString()
    println("$result ----------------------------")
}