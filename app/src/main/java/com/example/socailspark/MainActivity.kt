package com.example.socailspark

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var txtTOD: EditText
    lateinit var txtResult: TextView
    lateinit var btnStart: Button
    lateinit var btnClear: Button

    val m = "Morning"
    val mm = "Mid-Morning"
    val af = "Afternoon"
    val asn = "Afternoon snack time"
    val d = "Dinner"
    val ad = "After dinner"
    val n = "Night"

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtTOD = findViewById(R.id.txtTOD)
        txtResult = findViewById(R.id.txtResult)
        btnStart = findViewById(R.id.btnStart)
        btnClear = findViewById(R.id.btnClear)

        btnStart.setOnClickListener {
            val tod = txtTOD.text.toString()
            if(tod == m) {
                txtResult.text = "$m: send a 'Good Morning' message to all your friends and family."
            } else if (tod == mm) {
                txtResult.text = "$mm: Reach out to a colleague  with a quick thank you."
            } else if (tod == af) {
                txtResult.text = "$af: Share a funny meme or interesting link with a friend or family member"
            } else if (tod == asn) {
                txtResult.text = "$asn: Send a Quick 'thinking of you' message"
            } else if (tod == d) {
                txtResult.text = "$d: Call a friend or a relative for 5-min cath-up"
            } else if (tod == ad) {
                txtResult.text = "$ad/$n: Leave a thoughtful comment on a friend's post or message"
            } else if (tod == n) {
                txtResult.text = "$ad/$n: Leave a thoughtful comment on a friend's post or message"
            } else {
                txtResult.text = "Please enter the valid time of day from the keywords above!!!"
            }
        }

        btnClear.setOnClickListener {
            txtTOD.text.clear()
            txtResult.text = " "
        }
    }
}