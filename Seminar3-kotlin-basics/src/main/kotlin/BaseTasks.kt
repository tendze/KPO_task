import kotlin.math.sqrt

/**
    Задание 1: Функция,спрашивающая у пользователя его ФИО и выводящая его на экране.
    (0.5 балла)
    Формат вывода:
        " Фамилия:
          Имя:
          Отчество:
        "
 */
fun askForInput() {
    println("Введите вашу фамилию, имя и отчество (каждое с новой строки)")
    val fio = listOf(readln(), readln(), readln())
    println("Фамилия: %s\nИмя: %s\nОтчество: %s".format(*fio.toTypedArray()))
}

/**
    Задание 2: Функция, вычисляющая и возвращающая корни квадратного уравнения. (1 балл)
 */
fun quadraticRoots(a: Double, b: Double, c: Double): Pair<Double, Double> {
    var D: Double = b*b - 4*a*c
    return (-b+sqrt(D))/(2*a) to (-b-sqrt(D))/(2*a)
}

/**
    Задание 3: Вывести на экран трёхзначные десятичные числа s, все цифры которых одинаковы.
    (2 балла)
 */
fun printSameDigitNumbers() {
    for (i in 111 until 1000 step 111) {
        println(i)
    }
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
//    askForInput()

//    val roots = quadraticRoots(-5.0, 4.0, 3.0)
//    println("X1 = ${roots.first} ; X2 =${roots.second}")

//    printSameDigitNumbers()
}