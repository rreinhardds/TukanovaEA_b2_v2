package com.example.tukanovaea_02_02

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class third : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
    }
    fun Perehod3(view: View) {
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}