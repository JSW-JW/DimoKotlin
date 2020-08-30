fun main() {
    Person("장동건", 1995)
    Person("원빈")
    Person("이설")
    val a = Person2("윤성빈", 1989)
    a.introduce()
}

class Person(val name: String, val birthdayYear : Int) {
    init {
        println("${this.birthdayYear}년생 ${this.name}님이 생성되었습니다.")
    }

    constructor(name : String) : this(name, 1997) {  // 이와 같이 인스턴스 생성의 편의성을 제공
        println("${this.birthdayYear}년생 ${this.name}님이 보조 생성자에 의해 생성되었습니다.")
    }
}

class Person2(val name: String, val birthdayYear : Int) {

    fun introduce () {
        println("${this.birthdayYear}년생 ${this.name}이라고 합니다.")
    }

}