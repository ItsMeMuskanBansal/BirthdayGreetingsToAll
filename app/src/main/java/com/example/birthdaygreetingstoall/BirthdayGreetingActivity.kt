package com.example.birthdaygreetingstoall

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*
import kotlinx.android.synthetic.main.activity_birthday_greeting.view.*

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object{
        const val Name_Extra = "Name_Extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name = intent.getStringExtra(Name_Extra)
        BDayGreet.text = "Happy Birthday\n$name"
    }
}