package com.example.booksappmvvm02

object Repo {

    fun getAllBooks() = listOf<Book>(

        Book(
             bookName= "Some Name",
             bookPrice = "Rs, 599",
             bookAuthor = "Educational",
             bookGenre = "Some Author"
        ),
        Book(
            bookName= "Some Name 2",
            bookPrice = "Rs, 699",
            bookAuthor = "Educational 2",
            bookGenre = "Some Author 2"
        ),
        Book(
            bookName= "Some Name 3",
            bookPrice = "Rs, 799",
            bookAuthor = "Educational 3",
            bookGenre = "Some Author 3"
        ),
        Book(
            bookName= "Some Name 4",
            bookPrice = "Rs, 899",
            bookAuthor = "Educational 4",
            bookGenre = "Some Author 4"
        )
    )
}