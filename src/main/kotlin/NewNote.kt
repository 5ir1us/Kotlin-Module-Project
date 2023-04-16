class NewNote(val archive: Archive) {
    // Экран создания заметки
    private val menu = Menu()
    fun show() {

        menu.addOption1("Создать заметку") {
            print("Введите название заметки: ")
            val title = readlnOrNull() ?: ""
            print("Введите текст заметки: ")
            val text = readlnOrNull() ?: ""
            val note = Note(title, text)
            archive.addNote(note)
        }
        menu.addOption1("Вернуться на экран архивов") {   }

    }
}

