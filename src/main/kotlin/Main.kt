

//для тестирования функций поменяйте их параметры в методе main, если функция это позволяет
//каждая функция соответсвует одному заданию

fun main() {
    println("Задание 1:")
    task1()
    println("\nЗадание 2:")
    println(calculateAverage(listOf(1, 2, null, 4, null)))
    println("\nЗадание 3:")
    addProducts()
}


//Напишите класс Person с полями name (String) и age (Int?).
// Создайте экземпляр класса и инициализируйте поле name с помощью lateinit.
// Попробуйте обратиться к полю age без проверки на null.

fun task1() {
    val person = Person("Федя", null)
    println(person.age?.plus(1) ?: "age unknown")
}
//без проверки на null компилятор не дает проводить арифм. операции с полем age (для примера добавил увеличение возраста на 1)
//сделал, что если age = null, то выводится  "age unknown"




//Напишите функцию calculateAverage, которая принимает список чисел и возвращает их среднее значение.
//Если список пуст или содержит только null значения, функция должна вернуть null.

fun calculateAverage(numbersList: List<Int?>) : Double? {
    if (numbersList.isEmpty() ) return null //если список пуст, то возвращаем null
    else if (!(numbersList.any {it != null})) return null //если нет ни одного not-null, то возвращаем null
    else {
        val filteredList = numbersList.filterNotNull()
        return filteredList.average()
    }
}



//Создайте класс Product с полями name (String) и price (Double?).
// Инициализируйте поле name с помощью lateinit.
// Создайте список products и добавьте в него несколько экземпляров класса Product, включая нулевые значения.
// Выведите информацию о каждом продукте, включая его цену, с учетом возможности отсутствия значения.

fun addProducts() {
    val products = mutableListOf<Product>()
    products.add(Product("Lenovo"))
    products.add(Product("Machenike", 50000.0))
    products.add(Product("MacBook", 120000.0))
    for (product in products) {
        if (product.price == null) println("name: " + product.name)
        else println("name: " + product.name + " price: " + product.price)
    }
}
