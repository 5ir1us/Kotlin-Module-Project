class Menu : ArchiveApp() {
    private val options1 = mutableListOf<Pair<String, () -> Unit>>()
    private val options2 = mutableListOf<Pair<String, () -> Unit>>()
    private fun addOption(name: String, action: () -> Unit) {
        options1.add(Pair(name, action))
    }
    fun addOption2(name: String, action: () -> Unit) {
        options2.add(Pair(name, action))
    }


    private var isRunning = true // для остановки цикла


    fun display() {

        options1.add(Pair("Создать Архив") {
            val result = addArchive()//создает архив
            addOption(result.toString()) {


            }

        })

        options1.add(Pair("Выход") { isRunning = false })//выход из программы

        while (isRunning) {
            println(" Список Архивов:")

            options1.sortWith(compareBy { it.first == "Выход" })//сортировка
            options1.forEachIndexed { index, pair -> println("${index + 1}.${pair.first}") }
            val scan = readlnOrNull() ?: ""
            val scanInt = scan.toIntOrNull()

            if (scanInt == null || scanInt !in 1..options1.size) {
                println("Ошибка!  Не верный ввод.")
                continue
            }

            if (scanInt in 1..options1.size) {
                val menuItem = options1[scanInt - 1]
                menuItem.second.invoke()

            }
//            if (scanInt != options1.indexOf(Pair("Создать Архив") {})) {
//
//            }

        }
    }
}


/*класс, который содержит код:
По выводу пунктов меню;
По чтению пользовательского ввода;
По выполнению определённых операций на выбор пункта меню.
Для всего этого советуем использовать изменяемый список, который содержит в
себе название пункта и лямбду, которая вызовется при выборе этого пункта.*/