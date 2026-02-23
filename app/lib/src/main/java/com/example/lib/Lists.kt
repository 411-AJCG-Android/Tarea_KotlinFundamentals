package com.example.lib

fun main (){
    //T es para tipos genericos
    //Las listOf  ----> son de tamaño fijo
    val numbers = listOf(32,312,42,321,32,12,4,5)
    val dynamicNumber = mutableListOf(2,3,123,12)
    var maxNumber = numbers [0]
    for(number in numbers){
        if(number > maxNumber){
            maxNumber = number
        }
        println(number)
    }
}