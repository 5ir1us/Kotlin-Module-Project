class ViewNoteScreen (private var note: Notes?) {
    // Экран просмотра заметки


    fun show() {
        if (note == null) {
            println("Заметка не выбрана")
            return
        }

        println("Название: ${note?.title}")
        println("Текст: ${note?.text}")
    }
}