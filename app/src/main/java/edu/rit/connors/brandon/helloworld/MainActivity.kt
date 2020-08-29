package edu.rit.connors.brandon.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.textView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun toastMe(view: View){
        //Display toast message
        Toast.makeText(this,"Hello Toast!",Toast.LENGTH_SHORT).show()
    }
    fun countMe(view: View){
        //Get the textView
        val showCountTextView = findViewById<TextView>(R.id.textView)
        //Get the current value
        val countString = showCountTextView.text.toString()
        //Convert the value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count++
        //Display new value
        textView.text = count.toString()
    }
    fun randomMe(view:View){
        //Create intent to start new activity
        val randomIntent = Intent(this,SecondActivity::class.java)
        //Get current count value and parse as int
        val count = Integer.parseInt(textView.text.toString())
        //Add count to extras for intent
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT,count)
        //Start new activity
        startActivity(randomIntent)
    }
}//activity