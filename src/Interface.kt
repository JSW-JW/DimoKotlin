fun main() {
    val a = Dog2()
    a.eat()
    a.run()
}

interface Runner {
    fun run ()
}

interface Eater {
    fun eat () {
        println("음식을 먹습니다")
    }
}

class Dog2 () : Runner, Eater {
    override fun run () {
        println("우다다다다!!")
    }

    override fun eat () {
        println("허겁지겁 먹습니다")
    }
}