package com.viomi.kotlindemo

import kotlin.math.max
val name2 ="Tony"
fun main(){
//    接口用法
    val student5=Student5("Michell",31)
    student5.doHomework()
    doStudy(student5)
// 类实体化
  val studen=Student4()
    val studen1=Student4("Tonny",34)
    val studen2=Student4("123",6,"Jack",50)
}
fun doStudy(study: Study){  //面向接口编程，多态
    study.doHomework()
    study.readBooks()
}
//循环用法
fun forIn3(){   //降序10 8 6 4 2 0
    for (i in 10 downTo  0 step 2)
        print(" "+i)
    println()
}
fun forIn2(){   //打印0 2 4 6 8
    for (i in 0 until 10 step 2)
        print(" "+i)
    println()
}
fun forIn(){    //0 1 2 3 4 5 6 7 8 9 10
    for (i in 0..10)
        print(" "+i)
    println()
}
////////////////////////////////////////////////////////////////////////
fun getCount3(name : String)= when{
    name=="Tom" -> "87"
    name=="Jack" -> "98"
    name=="Jim" -> "66"
    name.startsWith(name2)-> "78"
    else -> 0
}
fun getCount2(num:Int){
    when(num%10){
        6-> println("及格1")
        7-> println("良2")
        8-> println("优3")
        9-> println("优4")
        10-> println("优5")
        else -> println("不及格")
    }
}
fun getCount(num1: Int)=if (num1>60) println("及格") else println("不及格")
fun largeNumber(num1:Int,num2:Int)= max(num1,num2)
fun min(param1: Int,param2: Int)=if (param1<param2) param1 else param2
fun jian(param1: Int,param2: Int)=param1-param2
fun add1 (param1:Int, param2:Int): Int {
    return param1+param2
}
