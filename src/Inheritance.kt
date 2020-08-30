fun main() {
    Animal("Filip", 5, "dog")
    Dog("Filip", 5)

    val a = Dog("Filip", 5)
    a.bark()
    a.introduce()
}

open class Animal (val name: String, val age: Int, var type: String) {
    fun introduce () {
        println("저는 ${this.name}이고 ${this.age}살이에요!")
    }
}

class Dog (name: String, age: Int) : Animal(name, age, "개") {
    fun bark () {
        println("bark!!")
    }
}