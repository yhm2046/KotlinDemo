package com.viomi.kotlindemo

import kotlin.math.max

fun main(){
//    val 不可变   var 可变
    val a = 10
    val b = 2
    println("min ="+ min(a,b))
}
fun min(param1: Int,param2: Int)=if (param1<param2) param1 else param2
fun jian(param1: Int,param2: Int)=param1-param2
fun add1 (param1:Int, param2:Int): Int {
    return param1+param2
}