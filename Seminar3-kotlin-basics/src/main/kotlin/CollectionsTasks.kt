/**
 *  Задание 1: Заменить все повторяющиеся элементы входного списка на "blahblah".
 *  (1 балл)
 */
fun replaceElements(array: List<String>): List<String> {
    val wordsCountMap = mutableMapOf<String, Int>()
    for (word in array) {
        wordsCountMap[word] = wordsCountMap.getOrDefault(word, 0) + 1
    }

    val result = mutableListOf<String>()
    for (i in array.indices) {
        result += if (wordsCountMap[array[i]] != 1) {
            "blahblah"
        } else {
            array[i]
        }
    }
    return result
}


/**
 *  Задание 2: Вернуть количество уникальных слов в строке.
 *  Слова в строке обязательно разделяются пробелом.
 *  (1 балл)
 */
fun uniqueWords(text: String): Int {
    val textArr: List<String> = text.split(" ")
    val wordsCountMap = mutableMapOf<String, Int>()
    var uniqueCount = 0
    for (word in textArr) {
        wordsCountMap[word] = wordsCountMap.getOrDefault(word, 0) + 1
    }

    for (count in wordsCountMap.values) {
        if (count == 1) {
            uniqueCount += 1
        }
    }

    return uniqueCount

}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val text = readlnOrNull()
    println(text?.let { uniqueWords(it) })

    // Вызвать для text и вывести результат замены на экран
    if (text != null) {
        print(replaceElements(text.split(" ")))
    }
}