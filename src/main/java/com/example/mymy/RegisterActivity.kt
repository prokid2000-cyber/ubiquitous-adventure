package com.example.mymy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)
        val a: Button = findViewById<Button>(R.id.ok)
        val e: Button = findViewById<Button>(R.id.exit)
        val newid = findViewById<EditText>(R.id.id)
        val newp = findViewById<EditText>(R.id.editText)
        val store = DataStorage.Singleton.store


        a.setOnClickListener{
            val u = newid.text.toString()
            val p = newp.text.toString()
            if(u == ""){
                errorshow.setText("No id typed in")
            }
            else if(p == ""){
                errorshow.setText("No password typed in")
            }
            else{
                store.put(u,p)
                errorshow.setText("Register Complete")
            }
        }

        e.setOnClickListener{
            val aa = Intent(this, MainActivity::class.java)
            startActivity(aa)
        }



    }



}