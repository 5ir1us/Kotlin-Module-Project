class NewNote(val archive: Archive) {
    // Экран создания заметки
    private val menu = Menu()
    fun show() {

        menu.addOption2("Создать заметку") {
            print("Введите название заметки: ")
            val title = readlnOrNull() ?: ""
            print("Введите текст заметки: ")
            val text = readlnOrNull() ?: ""
            val note = Notes(title, text)
            archive.addNote(note)
            menu.addOption2("Вернуться на экран архивов") { menu.display() }

        }


    }
}

