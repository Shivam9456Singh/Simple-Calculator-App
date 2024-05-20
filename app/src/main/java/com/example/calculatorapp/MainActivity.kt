package com.example.calculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnPlus:Button
    private lateinit var btnMinus:Button
    private lateinit var btnMultiply:Button
    private lateinit var btnDivide:Button
    private lateinit var eTInput1:EditText
    private lateinit var eTInput2:EditText
    private lateinit var tVResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlus = findViewById(R.id.btnPlus)
        btnMinus = findViewById(R.id.btnMinus)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnDivide = findViewById(R.id.btnDivide)

        eTInput1 = findViewById(R.id.eTInput1)
        eTInput2 = findViewById(R.id.eTInput2)
        tVResult = findViewById(R.id.tVResult)
        btnPlus.setOnClickListener{
            val input1 = eTInput1.text.toString().toInt()
            val input2 = eTInput2.text.toString().toInt()

            tVResult.text = (input1 + input2).toString()
        }

        btnMinus.setOnClickListener{
            val input1 = eTInput1.text.toString().toInt()
            val input2 = eTInput2.text.toString().toInt()

            tVResult.text = (input1 - input2).toString()
        }

        btnMultiply.setOnClickListener{
            val input1 = eTInput1.text.toString().toInt()
            val input2 = eTInput2.text.toString().toInt()

            tVResult.text = (input1*input2).toString()
        }

        btnDivide.setOnClickListener{
            val input1 = eTInput1.text.toString().toInt()
            val input2 = eTInput2.text.toString().toInt()

            tVResult.text = (input1/input2).toString()
        }
    }
}