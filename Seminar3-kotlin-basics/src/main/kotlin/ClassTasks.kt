/**
 * Задание 1: Объявите классы Circle и Square – наследников базового (Point).
 * Реализуйте readonly свойство, вычисляющее площадь каждой фигуры, а также функцию display()
 * для вывода информации о фигуре на экран.
 *
 * (3 балла)
 */
import kotlin.math.PI

open class Point(val X: Double, val Y: Double) {

    open val area: Double = 0.0

    open fun display() {
        val temp = listOf(X.toString(), Y.toString())
        println("X = %s, Y = %s".format(*temp.toTypedArray()))
    }
}

class Circle(X: Double, Y: Double, val R: Double) : Point(X, Y) {
    override val area: Double
        get() = PI * this.R * this.R

    override fun display() {
        val temp = listOf(area.toString(), X.toString(), Y.toString())
        println("S = %s, X = %s, Y = %s".format(*temp.toTypedArray()))
    }
}

class Square(X: Double, Y: Double, val Side: Double) : Point(X, Y) {
    override val area: Double
        get() = this.Side * this.Side

    override fun display() {
        val temp = listOf(area.toString(), X.toString(), Y.toString())
        println("S = %s, X = %s, Y = %s".format(*temp.toTypedArray()))
    }
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val p = Point(34.0, 56.0)
    val c = Circle(46.0, 34.0, 7.0)
    val s = Square(46.0, 34.0, 8.0)
    p.display()
    c.display()
    s.display()
}