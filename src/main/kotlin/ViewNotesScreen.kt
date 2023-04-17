class ViewNotesScreen(val archive: Archive) {
//    Экран просмотра списка заметок
//    также тут хотел реализовать чать кода
//    из NewNote  но что то пошло не так *(

    fun show() {

        if (archive.notes.isEmpty()) {
            println("Архив заметок пуст")
            return
        }
        println("Список заметок:")

    }
}
