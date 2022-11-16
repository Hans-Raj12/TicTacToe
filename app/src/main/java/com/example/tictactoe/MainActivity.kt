package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var toggle = false;
    var count=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun check(view: View) {
        val currentBtn = view as Button
        if (currentBtn.text == "") {
            count++
            if (toggle) {
                currentBtn.text = "X"
                toggle = false
            } else {
                currentBtn.text = "O"
                toggle = true
            }

            val btn1 = btn1.text.toString()
            val btn2 = btn2.text.toString()
            val btn3 = btn3.text.toString()
            val btn4 = btn4.text.toString()
            val btn5 = btn5.text.toString()
            val btn6 = btn6.text.toString()
            val btn7 = btn7.text.toString()
            val btn8 = btn8.text.toString()
            val btn9 = btn9.text.toString()


            if (btn1 == btn2 && btn2 == btn3 && btn3 != "") {
                Toast.makeText(this, "Winner is $btn1", Toast.LENGTH_LONG).show()
                newGame()
            } else if (btn4 == btn5 && btn5 == btn6 && btn6 != "") {
                Toast.makeText(this, "Winner is $btn4", Toast.LENGTH_LONG).show()
                newGame()
            } else if (btn7 == btn8 && btn8 == btn9 && btn9 != "") {
                Toast.makeText(this, "Winner is $btn6", Toast.LENGTH_LONG).show()
                newGame()
            } else if (btn1 == btn4 && btn4 == btn7 && btn7 != "") {
                Toast.makeText(this, "Winner is $btn1", Toast.LENGTH_LONG).show()
                newGame()
            } else if (btn2 == btn5 && btn5 == btn8 && btn8 != "") {
                Toast.makeText(this, "Winner is $btn2", Toast.LENGTH_LONG).show()
                newGame()
            } else if (btn3 == btn6 && btn6 == btn9 && btn9 != "") {
                Toast.makeText(this, "Winner is $btn3", Toast.LENGTH_LONG).show()
                newGame()
            } else if (btn1 == btn5 && btn5 == btn9 && btn9 != "") {
                Toast.makeText(this, "Winner is $btn1", Toast.LENGTH_LONG).show()
                newGame()
            } else if (btn3 == btn5 && btn5 == btn7 && btn7 != "") {
                Toast.makeText(this, "Winner is $btn3", Toast.LENGTH_LONG).show()
                newGame()
            } else if (count == 9) {
                Toast.makeText(this, "Draw Game!", Toast.LENGTH_LONG).show()
                newGame()
            }
        }
    }
    fun newGame(){
        btn1.text=""
        btn2.text=""
        btn3.text=""
        btn4.text=""
        btn5.text=""
        btn6.text=""
        btn7.text=""
        btn8.text=""
        btn9.text=""
    }
}