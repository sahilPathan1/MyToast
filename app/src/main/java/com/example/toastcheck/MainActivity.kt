package com.example.toastcheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.MYToast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    lateinit var myToast: MYToast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myToast = MYToast(this)

        val button :MaterialButton =findViewById(R.id.button)
        button.setOnClickListener {
            myToast.showMessage("Hello my name is kishan")
        }

    }
}