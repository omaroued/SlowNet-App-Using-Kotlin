package com.slownett.slownettapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    // Move from one activity to another

    fun buNext(view: View){
        var intent=Intent(this,second::class.java)
        startActivity(intent)
    }
}
