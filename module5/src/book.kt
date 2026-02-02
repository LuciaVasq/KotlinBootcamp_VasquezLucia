class Book (val title: String, val author: String, val year: Int) {

    fun getTitleAuthor(): Pair<String, String> {
        return title to author
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}
fun main() {
    val myBook = Book("The Hobbit", "J.R.R. Tolkien", 1937)

    val (title, author, year) = myBook.getTitleAuthorYear()

    println("Here is your book $title written by $author in $year.")

    val allBooks = setOf("Hamlet", "Macbeth", "Romeo and Juliet", "King Lear")

    val library = mapOf(allBooks to "William Shakespeare")

    val hasHamlet = library.any { it.key.contains("Hamlet") }
    println("Is Hamlet in the library? $hasHamlet")

    val moreBooks = mutableMapOf<String, String>("Othello" to "William Shakespeare")

    moreBooks.getOrPut("The Tempest") { "William Shakespeare" }

    moreBooks.getOrPut("Othello") { "Unknown Author" }

    println("\nCurrent moreBooks collection:")
    println(moreBooks)

}