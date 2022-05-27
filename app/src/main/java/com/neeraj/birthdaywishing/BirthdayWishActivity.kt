package com.neeraj.birthdaywishing

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.neeraj.birthdaywishing.MainActivity.Companion.USER_NAME

class BirthdayWishActivity : AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_wish)

        val name = intent.getStringExtra(USER_NAME)

        findViewById<TextView>(R.id.txv_act_birthday_wish).text = "Happy Birthday\n$name"

    }

}