package com.example.mylibrary

import android.content.Context
import android.widget.Toast

class MYToast(private val context: Context) {

    fun showMessage(msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

}