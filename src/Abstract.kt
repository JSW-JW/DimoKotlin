fun main() {
    val a = Rabbit()
    a.sniff()
    a.eat()
}

abstract class Animal3 () {
    abstract fun eat ()
    fun sniff () {
        println("킁킁")
    }
}

class Rabbit () : Animal3 () {
    override fun eat() {
        println("당근 맛있다..!!")
    }
}