package com.viomi.kotlindemo

fun main() {
//    /***************Lambda函数式编程：2.6.2 集合式函数api***************/
//    all 和any
    val list30= listOf("jack","michael","michalle","tony","zora")
    println("any result is:"+list30.any {it.length<5})
    println("all result is:"+list30.all {it.length<5})
    println("-------------------------------------------")
//    只保留5个字内的字符串
    val listName= listOf("9x","pixleXL","nexus 6p","pixel2XL","abc","fffff","123")
    val listN2=listName.filter { it.length<4 }.map { it.toUpperCase() }
    for (name in listN2) println(name)
    println("-------------------------------------------")
//     把所有小写变成大写
    val list1= listOf("apple","banana","watermelon")
    val list2=list1.map { it.toUpperCase() }
    for (fruit in list2) println(fruit)
}