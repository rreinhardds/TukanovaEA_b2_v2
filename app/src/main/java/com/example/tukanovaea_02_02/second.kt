package com.example.tukanovaea_02_02

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
    fun Perehod2(view: View) {
        val intent= Intent(this,third::class.java)
        startActivity(intent)
    }
}