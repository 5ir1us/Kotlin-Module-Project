open class ViewNotesScreen  (private val archive: Archive)  {
// Экран просмотра списка заметок

        fun show() {
            if (archive.notes.isEmpty()) {
                println("Архив заметок пуст")
                return
            }

            println("Список заметок:")
            for ((index, note) in archive.notes.withIndex()) {
                println("${index + 1}. ${note.title}")
            }
        }
    }
