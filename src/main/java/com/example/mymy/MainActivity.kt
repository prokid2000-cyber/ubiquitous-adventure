package com.example.mymy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.system.exitProcess


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a: Button = findViewById<Button>(R.id.register)
        val b : Button = findViewById<Button>(R.id.login)
        val e : Button = findViewById<Button>(R.id.exit)

        a.setOnClickListener{
            val aa = Intent(this, RegisterActivity::class.java)
            startActivity(aa)
        }
        b.setOnClickListener{
            val bb = Intent(this, LoginActivity::class.java)
            startActivity(bb)
        }
        e.setOnClickListener{
            exitProcess(0)
        }
    }
}
