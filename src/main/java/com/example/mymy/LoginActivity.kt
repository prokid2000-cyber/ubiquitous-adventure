package com.example.mymy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.register.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        val a: Button = findViewById<Button>(R.id.ok)
        val e: Button = findViewById<Button>(R.id.exit)
        val id = findViewById<EditText>(R.id.editText2)
        val pass = findViewById<EditText>(R.id.editText3)
        val store = DataStorage.Singleton.store

        a.setOnClickListener{
            val u = id.text.toString()
            val p = pass.text.toString()
            if(u == ""){
                errorshow.setText("No id typed in")
            }
            else if(p == ""){
                errorshow.setText("No password typed in")
            }
            else if(store.get(u)==null){
                errorshow.setText("Non-existing id")
            }
            else if(store.get(u) != p){
                errorshow.setText("Incorrect password")
            }
            else{
                errorshow.setText("Welcome")
            }
        }

        e.setOnClickListener{
            val aa = Intent(this, MainActivity::class.java)
            startActivity(aa)
        }


    }
}
