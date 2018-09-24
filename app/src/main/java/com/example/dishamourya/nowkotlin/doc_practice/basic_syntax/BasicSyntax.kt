package com.example.dishamourya.nowkotlin.doc_practice.basic_syntax

fun addWithReturnType(a: Int, b: Int): Int {
    return a + b
}

fun addWithoutReturnType(a: Int, b: Int) {
    a + b
}

fun returningNoMeaningfulType(a: Int, b: Int): Unit {
    print("sum of $a and $b is ${a + b}")
}

fun returnWithoutMension(a: Int,b: Int){
    println("sum of $a and $b is ${a+b}")
}