package edu.rit.connors.brandon.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class SecondActivity : AppCompatActivity() {
    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    fun showRandomNumber() {
        //Get the count from extras
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        //Generate random number
        val random = Random()
        var randomInt = 0
        //Add one because bound is exclusive
        if (count > 0) { randomInt = random.nextInt(count + 1) }
        //Display random number
        textView_random.text = getString(R.string.second_activity_random_number, randomInt)
        //Insert number into heading
        textView_label.text = getString(R.string.second_activity_random_heading, count)
    }
}