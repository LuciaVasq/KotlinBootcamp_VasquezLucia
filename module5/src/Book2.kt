const val MAX_BOOKS_BORROWED = 5

class Book2(val title: String, val author: String) {

    fun canBorrow(currentBorrowedCount: Int): Boolean {
        return currentBorrowedCount < MAX_BOOKS_BORROWED
    }

    fun printUrl() {

        val formattedTitle = title.replace(" ", "_")
        println("${Constants.BASE_URL}$formattedTitle.html")
    }

    companion object Constants {
        const val BASE_URL = "https://library.example.com/catalog/"
    }
}

object GlobalLibraryConfig {
    const val LIBRARY_NAME = "Central Library"
}

fun main() {
    val myBook = Book2("Hamlet", "William Shakespeare")

    println("Can borrow 3 books? ${myBook.canBorrow(3)}")
    println("Can borrow 6 books? ${myBook.canBorrow(6)}")

    myBook.printUrl()
}