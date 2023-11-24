
/**
    Задание 1: Сформировать целочисленный массив A из N элементов
    при помощи ввода значений с клавиатуры (N вводит пользователь).
    Вывести массив на экран. (1 балл)
 */
fun makeArray(): Array<Int> {
    val N: Int = readlnOrNull()?.toInt() ?: 0
    var result: Array<Int> = arrayOf()
    for (i in 0 until N) {
        result += readlnOrNull()?.toInt() ?: 0
    }
    return result
}

/**
    Задание 2: Написать функцию для сортировки массива по убыванию и его вывода на экран.
    Использовать встроенные функции. (0.5 балла)
 */
fun sortArrayDesc(arr: Array<Int>) {
    arr.sort()
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val arr = makeArray()
    sortArrayDesc(arr)
    println(arr.joinToString(", "))
}

