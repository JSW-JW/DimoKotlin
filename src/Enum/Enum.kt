package Enum

enum class Color (val color: String, val colorName: String) {
    RED("0xFF0000", "빨강"),
    GREEN("0x00FF00", "초록"),
    BLUE("0x0000FF", "파랑")
}

fun colorGuide (c: Color) : String {
    val color = when (c) {
        Color.RED -> "${c.colorName}색의 컬러 코드는 ${c.color}입니다. ${c.name} 좋아하시나요?"
        Color.GREEN -> "${c.colorName}색의 컬러 코드는 ${c.color}입니다. ${c.name} 좋아하시나요?"
        Color.BLUE -> "${c.colorName}색의 컬러 코드는 ${c.color}입니다. ${c.name} 좋아하시나요?"
    }
    return color
}

fun main() {
    val a = colorGuide(Color.RED)
    val b = colorGuide(Color.BLUE)
    val c = colorGuide(Color.GREEN)
    println(a)
    println(b)
    println(c)
}