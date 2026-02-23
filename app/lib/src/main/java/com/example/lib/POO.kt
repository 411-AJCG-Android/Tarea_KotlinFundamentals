package com.example.lib

//Principios de POO: A PIE, Herencia, Polimorfismo, Encapsulamiento, Abstracción

//Tipos de clases
class Person (val name : String, val age : Int){ //El constructor se declara al principio
    fun sayHello(){
        println("Hola soy $name y tengo $age")
    }
}

//Metodos en KOTLIN
/*
* Se definen con fun
* para regresar un dato se utiliza : Tió de Dato
* fun calcularArea() : Double
*       return 1.0
*/

//ABSTRACCION --> modelas solo lo importante
    //La diferencia principal entre una clase normal y una abstracta es que las abstractas NOO PUEDEN instanciar objetos
    //abstract class: no pueden crear oobjetos, no se pueden instanciar objetos

abstract class Shape{ //clase papá
    abstract fun calculateArea() : Double
}

class Circle (val radius : Double) : Shape(){ //Herencia --> circle esta heredando de shape.    :Shape <--- esto significa heredar
    override fun calculateArea(): Double {
        return radius * radius * Math.PI
    }
}

class Square(val side : Double) : Shape() {
    override fun calculateArea(): Double {
        return side * side
    }
}

//Que es una interfaz grafica --> una interfaz es un contraro (le dice a una clase que hacer y se compromete a hacerlo)

interface Ave{
    fun fly()
    fun poop()
    fun peep()
    fun coito()
}

final class Eagle : Ave {
    override fun fly() {
        TODO("Not yet implemented")
    }

    override fun poop() {
        TODO("Not yet implemented")
    }

    override fun peep() {
        TODO("Not yet implemented")
    }

    override fun coito() {
        TODO("Not yet implemented")
    }

} //final --> significa que otra clase no puede heredar, es la unica

open class Animal(val name : String){ //open class --> si se pueden instanciar, me permite heredar y agregar comportamiento extra
    open fun makeSound(){
        println("$name esta haciendo un sonido")
    }
}

class Dog : Animal(name = "Bonnie"){

}

class Cat(val catName : String) : Animal(name = catName){
    fun trepar(stairs:Int,place:String) { //argumentos en metodos
        println("$name trepo $stairs escalones en $place")
    }
}

fun main(){
    val persona = Person ("Juan Frausto",28) //No se puede cambiar el orden de los datos
    val persona2 = Person (age = 29, name = "Juan Frausto") //Se puede cambiar el orden de los datos
    val cat = Cat("Coco")
    cat.trepar(3, "La Salle")
    persona.sayHello()
    persona2.sayHello()
    println("El nombre de la persona 1 es ${persona.name}")

    val square1 = Square(side = 34.5)
    val square2 = Square(side = 12.3)
    val circle = Circle(radius = 10.0)
    val shapes = listOf<Shape>(square1,square2,circle) // Polimorfismo --> cuando varios objetos de distintas clases, derivadas de una superclase comun(la clase padre)
    for(shape in shapes){
        println(shape.calculateArea())
    }
}

