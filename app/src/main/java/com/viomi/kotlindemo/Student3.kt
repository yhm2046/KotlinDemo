package com.viomi.kotlindemo

class Student3 (val sno:String,val grade:Int):Person() {
    init {
        println("sno:"+sno)
        println("grade:"+grade)
    }
}