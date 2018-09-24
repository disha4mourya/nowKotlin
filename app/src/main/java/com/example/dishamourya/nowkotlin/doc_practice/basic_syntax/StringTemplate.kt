package com.example.dishamourya.nowkotlin.doc_practice.basic_syntax

var o=1
val string="o is $o"

fun change(){
    o=8
    val str="${string.replace("is","was")}, but now is $o"
}



