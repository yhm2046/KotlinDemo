package com.viomi.kotlindemo

import kotlin.math.max
val name2 ="Tony"
fun main(){
    /***************Lambda函数式编程：2.6.2 集合式函数api***************/
//     把所有小写变成大写
//    找到单词最长的结果
    val list6= listOf("apple","orange","watermelon","watermelo1")
    val lamba6= list6.maxByOrNull({ fruit:String->fruit.length})
    println("6max length fruit:"+lamba6+"\n")

    val list5= listOf("apple","orange","watermelon","watermelo1")
    val lamba1={fruit:String->fruit.length}
    println("max length fruit:"+ list5.maxByOrNull(lamba1) +"\n")

    val list4= listOf("apple","orange","watermelon","watermelo1")
    println("max length fruit:"+ list4.maxByOrNull { it.length } +"\n")
    /***************Lambda函数式编程：2.6.1 集合的创建与遍历***************/
//map遍历
    val map2= mapOf("pixel" to 1,"pixel2XL" to 2,"nexus 6p" to 3)
    for ((phone,number)in map2) println("phone:"+phone+",num:"+number)
    println("---------------------------------------------")
    for (name in map2) println(name)
    println("---------------------------------------------")
    val map=HashMap<String,Int>()
    map["michael"]=1
    map["evan"]=2
    map["zara"]=1
    map["jack"]=4
    map["michael2"]=5
    for (name in map) println(name)
    println("---------------------------------------------")
//可变set遍历
    val set1= setOf("apple","banana","orange")
    for (fruit in set1) println(fruit)
    println("---------------------------------------------")
//    可变arrylist例子
    val list2= mutableListOf("apple","banana","orange")
    list2.add("watermelon")
    for (fruit in list2) println(fruit)
//    遍历arraylist
    val list= listOf("apple","banana","orange")
    for (fruit in list) println(fruit)
//    测试2.5.4   数据类与单例类
    /******************单例类例子************************/
    println("调用单例中的函数:"+Singleton.singletonTest())
    /******************数据类例子************************/
    val cellphone1=Cellphone("pixelxl",600.99)
    val cellphone2=Cellphone("pixelxl",600.99)
    println(cellphone1)
    println("cellphone1 equals cellphone2:"+(cellphone1==cellphone2))
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
