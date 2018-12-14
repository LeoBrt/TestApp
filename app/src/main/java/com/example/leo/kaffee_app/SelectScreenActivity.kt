package com.example.leo.kaffee_app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_select_screen.*

class SelectScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_screen)


        var selected_photo = intent.getIntExtra("photo",0)

        imageView3.setImageResource(selected_photo)

        val timeSet = arrayListOf<String>("Now","5 mins.","10 mins.")

        val adapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,timeSet)

        mySpinner.adapter=adapter
        continue_arrow.setOnClickListener {
            it.context.startActivity(Intent(it.context, InvitationActivity::class.java).putExtra("photo",selected_photo))
        }
    }
}
