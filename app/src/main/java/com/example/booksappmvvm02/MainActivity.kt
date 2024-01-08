package com.example.booksappmvvm02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var booksViewModel: BooksViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        booksViewModel = ViewModelProvider(this).get(BooksViewModel::class.java)

        booksViewModel.booksLiveData.observe(this){

            //use it to inflate the ui
            //use this list and pass to adapter
            //Toast.makeText(this, "fail in room count", Toast.LENGTH_SHORT).show()
            Log.i("All books", it.toString())

        }

    }
}