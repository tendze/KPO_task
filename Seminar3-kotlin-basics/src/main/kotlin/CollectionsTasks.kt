/**
 *  Задание 1: Заменить все повторяющиеся элементы входного списка на "blahblah".
 *  (1 балл)
 */
fun replaceElements(array: List<String>): List<String> {
    return listOfNotNull()
}


/**
 *  Задание 2: Вернуть количество уникальных слов в строке.
 *  Слова в строке обязательно разделяются пробелом.
 *  (1 балл)
 */
fun uniqueWords(text: String): Int {
    val textArr: List<String> = text.split(" ")
    var wordsCountMap = mutableMapOf<String, Int>()



}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val text = readlnOrNull()
    println(text?.let { uniqueWords(it) })

    // Вызвать для text и вывести результат замены на экран
    //replaceElements()
}