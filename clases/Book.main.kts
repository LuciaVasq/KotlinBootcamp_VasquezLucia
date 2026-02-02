#!/usr/bin/env kotlin

open class Book(val title: String, val author: String) {

    private var currentPage = 0

    open fun readPage() {
        currentPage++
        println("Leyendo la pagina: $currentPage de '$title'")
    }
}
class eBook(title: String, author: String, val format: String = "text") : Book(title, author) {

    private var wordCount = 0

    override fun readPage() {
        wordCount += 250
        println("leyendo ebook '$title'. Totla de palabras: $wordCount")
    }
}
fun main() {
    val myPaperback = Book("The Great Gatsby", "F. Scott Fitzgerald")
    myPaperback.readPage()

    val myKindle = eBook("Digital Fortress", "Dan Brown")
    myKindle.readPage()
    myKindle.readPage()
}