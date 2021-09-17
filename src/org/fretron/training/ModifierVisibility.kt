package org.fretron.training

private class A {

    private var x : Int = 10

    fun getX() = x

    fun accessBsVar(){
        val b = B()
        println(b.getY())
    }
}

private class B{
    private var y : Int = 20

    fun getY() = y

    fun accessAsVar() {
        val a = A()
        println(a.getX())
    }
}

internal class C{

}



fun main(){

    val a = A()
    println(a.getX())
    println(a.accessBsVar())

    val b = B()
    println(b.getY())
    println(b.accessAsVar())
}