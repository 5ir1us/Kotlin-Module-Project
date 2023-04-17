  class ViewNoteScreen  (var note: Note?) {
    // Экран просмотра заметки
    private val menu = Menu()
//    private val notebBack = NewNote ()
    fun show() {
        while (true) {
            menu.clearOptions1()
            if (note == null) {
                println("Заметка не выбрана")
                return
            }

            println("Название: ${note?.title}")
            println("Текст: ${note?.text}")


            menu.addOption1("назад") { }
            menu.sortOptions(compareBy { it.first == "назад" })
            menu.display()
        }
    }
}