class A {
    init {
        println("Class init method.")
    }

    object SingletonA  {
        init {
            println("SingletonA class is invoked")
        }
        var name="Kotlin objects A"
        fun printName(){
            println(name)
        }
    }
    companion object SingletonB{
        init {
            println("SingletonB class is invoked")
        }
        var name="Kotlin objects B"
        fun printName(){
            println(name)
        }

    }
}

fun main() {
    var a = A()
    var aa=A.name
    A.name="Kotlin Tutorials"
    A.printName()
}
