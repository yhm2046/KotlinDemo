package com.viomi.kotlindemo

fun main() {
//    判空工具
    getLength1("length is :null")
    getLength1(null)
//    2.7空指针检查
//    doStudy1(null)    //空指针报错
    val student1=Student5("javk",34)
    doStudy3(student1)
}
fun getLength1(text:String?)=println("length is :"+text?.length?:0)

fun doStudy4(study: Study?){
    study?.let {
        it.readBooks()
        it.doHomework()
    }
}
fun doStudy3(study: Study?){
    study?.let { stu ->
        stu.readBooks()
        stu.doHomework()
    }
}
fun doStudy2(study: Study?){
    study?.readBooks()
    study?.doHomework()
}

fun doStudy1(study: Study?){
    if (study!=null){
        study.readBooks()
        study.doHomework()
    }
}