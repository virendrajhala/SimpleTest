package org.fretron.training

class Person constructor(name:String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also (::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

class Employee(var name : String, var email : String, val age : Int, var isEmployeed : Boolean = true){

    init{
        println("Primary initializer : $name has email id : $email")
    }

    init{
        println("secondary initializer : $name has age : $age")
    }
}

class Emp(iValue : Int){

    var i = iValue
    init{
        println("Initializer block")
        println("i value $i")
    }

    constructor(i : Int, j : Int) : this(i){
        println("Constructor $i");
        println("j value : $j")
    }
}

class MyClass{
    //companion object{...}
    companion object Factory{

        fun create() : MyClass = MyClass()
    }
}

class Company{
    var name : String = "abc"
    get() = field
    set(value) {
        field = value
    }
}

fun main(){

    val c = Company()
    println(c.name)
    c.name = "fretron"
    println(c.name)
//    //val instance = MyClass.Companion
//    val instance = MyClass.create()

//    var e1 = Emp(10,20)
//    val e = Employee("Virendra","virendrajhala@gmail.com",23)
//    println(e.name)
//    println(e.email)
//    println(e.age)
//    println(e.isEmployeed)
//    val p = Person("Virendra")
//    println(p.firstProperty)
//    println(p.secondProperty)


//    val text = """
//    >Tell me and I forget.
//    >Teach me and I remember.
//    >Involve me and I learn.
//    >(Benjamin Franklin)
//    """.trimMargin(">")
//
//    var s = "abc"
//    val sBuilder = StringBuilder("abc")
//    var st = String(sBuilder)
//   // var st = "abc"
//   // st+"abc";
//
//    println(s === st)
//    println(text);
//    println(st);
//
//    var arr = Array<Int>(5){it * 2}
//    arr.forEach {
//        println(it)
//    }
}
