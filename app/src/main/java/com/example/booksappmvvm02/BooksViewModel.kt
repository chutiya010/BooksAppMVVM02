package com.example.booksappmvvm02

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BooksViewModel: ViewModel() {

    val booksLiveData = MutableLiveData<List<Book>>()

    init {
        getAllBooks()
    }

    fun getAllBooks() {
        val allBooks = Repo.getAllBooks()
        //we can perform all the business logic
        booksLiveData.value = allBooks

    }

}