class ViewNoteScreen (private var note: Note?) {
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