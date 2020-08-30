fun main() {
    val t = Tiger()
    t.eat()
}

open class Animal2 {  // 다른 파일에서 Animal 클래스가 상속되므로, 단지 클래스명 구분을 위해 '2'를 붙여주었음
    open fun eat () {
        println("음식을 먹습니다")
    }
}

class Tiger : Animal2 () {
    override fun eat () {
        println("고기를 먹습니다")
    }
}