package Ramda

fun main() {
//    b(::a)
//    val c : (String) -> Unit = {str -> println("$str 람다 함수")}
    val c = {str: String -> println("$str 람다 함수(축약형)")}
    b(c)

    val d : (String) -> Unit = { println("$it 람다 함수")}  // parameter가 1개 일 때는, 선언하지 않고 it으로 대체 가능
    b(d)
}

//  fun a (str: String) {
//    println("$str 함수 a")
//  }

fun b (function: (String) -> Unit) {
    function("b가 호출한")
}