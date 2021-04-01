package com.viomi.kotlindemo

fun main() {
//    2.8 kotlin中小魔术
//    默认参数
    whopay()
    whopay(name="sara")
    whopay(price = 199.99)
    println("---------------------------------------------")
    loveyou()
    loveyou("evan")
    loveyou("tony","michelle")
//    连字符使用
    val str1="I"
    val str2="Love"
    val str3="You"
    val str4="!"
    println("$str1 $str2 $str3 $str4")
}
fun whopay(name:String?="jack",price:Double?=99.99)= println("$name pay $$price\n")
fun loveyou(name:String="Michael",who:String="Zara")= println("$name love $who")