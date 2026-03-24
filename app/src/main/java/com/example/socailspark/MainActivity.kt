package com.example.socailspark

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {

    // Variables
    lateinit var txtTOD: EditText
    lateinit var tvResult: TextView
    lateinit var btnStart: Button
    lateinit var btnClear: Button

    //This the keywords for each time of day that the user can enter
    val m = "Morning"
    val mm = "Mid-Morning"
    val af = "Afternoon"
    val asn = "Afternoon snack time"
    val d = "Dinner"
    val ad = "After dinner"
    val n = "Night"

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        // The setup for the app
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtTOD = findViewById(R.id.txtTOD)
        tvResult = findViewById(R.id.tvResult)
        btnStart = findViewById(R.id.btnStart)
        btnClear = findViewById(R.id.btnClear)

        btnStart.setOnClickListener {

            //The display for the topic for each time of day using the if statements

            // This is from text color change is from Gabriele Mariotti's answer on StackOverflow:
            // https://stackoverflow.com/questions/5679138/how-to-change-the-text-color-of-a-textview-in-android

            val tod = txtTOD.text.toString()
            tvResult.setTextColor(getColor(R.color.black))
            if(tod == m) {
                tvResult.text = "$m: Send a 'Good Morning' message to all your friends and family."
            } else if (tod == mm) {
                tvResult.text = "$mm: Reach out to a colleague with a quick thank you."
            } else if (tod == af) {
                tvResult.text = "$af: Share a funny meme or interesting link with a friend or family member"
            } else if (tod == asn) {
                tvResult.text = "$asn: Send a Quick 'thinking of you' message"
            } else if (tod == d) {
                tvResult.text = "$d: Call a friend or a relative for 5-min cath-up"
            } else if (tod == ad) {
                tvResult.text = "$ad/$n: Leave a thoughtful comment on a friend's post or message"
            } else if (tod == n) {
                tvResult.text = "$ad/$n: Leave a thoughtful comment on a friend's post or message"
            } else {

                tvResult.setTextColor(getColor(R.color.red))
                tvResult.text = "$tod!!! Please enter the valid time of day from the keywords above!!!"
            }
        }
        //Clear the text fields
        btnClear.setOnClickListener {
            txtTOD.text.clear()
            tvResult.text = " "
        }
    }
}