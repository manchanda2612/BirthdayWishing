package com.neeraj.birthdaywishing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    companion object {
        const val USER_NAME = "name"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button  = findViewById<Button>(R.id.btn_act_main_create_birthday_card)

        button.setOnClickListener {

            val edtName = findViewById<EditText>(R.id.edt_tx_act_main_name).editableText.toString()


            val intent = Intent (this, BirthdayWishActivity::class.java)
            intent.putExtra(USER_NAME, edtName)
            startActivity(intent)
        }

    }
}