package com.viomi.kotlindemo

class Student5(name:String,age:Int):Person2(name,age),Study {
    override fun readBooks() {
        println(name+"is reading book")
    }

//    override fun doHomework() {
//        println(name+"is doing homework")
//    }
}