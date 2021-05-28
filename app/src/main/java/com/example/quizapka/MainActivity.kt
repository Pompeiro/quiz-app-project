package com.example.quizapka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val btn:Button = findViewById(R.id.btn_start)
        val et_name:TextView = findViewById(R.id.et_name)

        btn.setOnClickListener{

            if(et_name.text.toString().isEmpty()){
                Toast.makeText(this, "Podaj swoje imię", Toast.LENGTH_SHORT).show()
            }
            else
            {
                val intent = Intent(this, QuizPytaniaActivity::class.java)
                intent.putExtra(Constants.USER_NAME, et_name.text.toString())
                startActivity(intent)
                finish()
            }
        }

    }
}