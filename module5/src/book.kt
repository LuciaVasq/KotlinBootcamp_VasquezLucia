class Book (val title: String, val author: String, val year: Int) {

    fun getTitleAuthor(): Pair<String, String> {
        return title to author
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}
fun main() {
    val myBook = Book("Bury our bones in the midnight soil", "V.E Swab", 1937)

    val (title, author, year) = myBook.getTitleAuthorYear()

    println("Here is your book $title written by $author in $year.")

    val allBooks = setOf("The house of the cerulean sea", "under the whispering door", "WolfSong", "In the lives of puppets")

    val library = mapOf(allBooks to "T.J Klune")

    val hasHamlet = library.any { it.key.contains("sea") }
    println("Is The house of the cerulean sea in the library? $hasHamlet")

    val moreBooks = mutableMapOf<String, String>("Othello" to "WT.J Klune")

    moreBooks.getOrPut("We burned so bright") { "T.J Klune" }

    moreBooks.getOrPut("Othello") { "Unknown Author" }

    println("\nCurrent moreBooks collection:")
    println(moreBooks)

}