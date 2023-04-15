open class ArchiveApp {
    private val archivesList = mutableListOf<Archive>()

    fun addArchive(): String {

        print("Введите имя архива: ")
        val nameArchive = readlnOrNull() ?: ""
        val archiveNew = Archive(nameArchive)
        println("*** Вы создали архив: $nameArchive ***\n   ")
        archivesList.add(archiveNew)
        return nameArchive

    }


}




