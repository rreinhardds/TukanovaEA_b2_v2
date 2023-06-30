package com.example.tukanovaea_02_02

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Perehod1(view: View) {
        val intent= Intent(this,second::class.java)
        startActivity(intent)
    }
}