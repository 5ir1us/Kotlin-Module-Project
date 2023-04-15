class Archive(private val archiveName: String) {
    val notes = mutableListOf<Notes>()
    fun addNote(note: Notes) {
        notes.add(note)
     println("запись '${note.title}' добавлено в архив' $archiveName'")
    }
}


/*Выбор элемента из списка и создание объекта.
Выбор архива, выбор заметки, экран заметки — это меню выбора.*/