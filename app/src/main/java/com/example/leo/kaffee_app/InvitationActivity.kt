package com.example.leo.kaffee_app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_invitation.*


class InvitationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_invitation)
        var selected_photo = intent.getIntExtra("photo",0)
        imageView5.setImageResource(selected_photo)
        Haken.setOnClickListener {
            it.context.startActivity(Intent(it.context, MainActivity::class.java))
        }
    }
}
