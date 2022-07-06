package com.nexle.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvName : TextView = findViewById(R.id.tv_name)
        val tvScore : TextView = findViewById(R.id.tv_score)
        val btnFinish : Button = findViewById(R.id.btn_finish)

        tvName.text = intent.getStringExtra(Constrants.USER_NAME)
        val totalQuestions = intent.getIntExtra(Constrants.TOTAL_QUESTION,0)
        val correctQuestion  = intent.getIntExtra(Constrants.CORRECT_ANSWERS,0)
        tvScore.text ="Your Score is $correctQuestion out of $totalQuestions"
        btnFinish.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}