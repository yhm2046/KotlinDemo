package com.viomi.kotlindemo

class Student4(val sno:String, val grade:Int, name:String, age:Int):Person2(name,age) {
    constructor(name: String,age: Int):this("",0,name,age){}    //次构找函数
    constructor():this("",0){}
}