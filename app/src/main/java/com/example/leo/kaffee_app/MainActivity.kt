package com.example.leo.kaffee_app

import android.app.Application
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import java.util.*
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val llm = LinearLayoutManager(this)
        recyclerView.layoutManager = llm
        val adapter = RVAdapter(initializeData())
        recyclerView.adapter = adapter

    }
}

class Person(var name: String, var photoId: Int)

private var persons = mutableListOf<Person>()

// This method creates an ArrayList that has three Person objects
// Checkout the project associated with this tutorial on Github if
// you want to use the same images.
private fun initializeData(): List<Person> {
    persons = ArrayList()
    persons.add(Person("Emma Wilson", R.drawable.prof_5))
    persons.add(Person("Lavery Maiss", R.drawable.prof_girl1))
    persons.add(Person("Lillie Watts", R.drawable.prof_4))
    return persons
}

