import kotlin.random.Random

class Book3(val title: String, var pages: Int)

fun Book3.getWeight(): Double = pages * 1.5

fun Book3.tornPages(torn: Int) {
    if (pages >= torn) pages -= torn else pages = 0
}

class Puppy {

    fun playWithBook(book: Book3) {
        val pagesToTear = Random.nextInt(1, 21)
        book.tornPages(pagesToTear)
        println("The puppy played with '${book.title}'. Current pages: ${book.pages}. Weight: ${book.getWeight()}g")
    }
}

fun main() {
    val myBook = Book3("Kotlin for Puppies", 100)
    val puppy = Puppy()

    while (myBook.pages > 0) {
        puppy.playWithBook(myBook)
    }

    println("\nRest in pieces, '${myBook.title}'.")
}