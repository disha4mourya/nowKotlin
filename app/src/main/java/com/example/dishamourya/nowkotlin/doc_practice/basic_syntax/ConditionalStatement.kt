package com.example.dishamourya.nowkotlin.doc_practice.basic_syntax

fun max(a: Int, b: Int) = if (a > b) a else b

fun maxOf(a: Int, b: Int): Int {
    if (a > b)
        return a
    else
        return b
}