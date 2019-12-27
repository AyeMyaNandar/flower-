package com.example.proj3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editNumOne=findViewById<EditText>(R.id.edit_num_one)
        val editNumTwo=findViewById<EditText>(R.id.edit_num_two)

        val btnSum=findViewById<Button>(R.id.btn_sum)
        val btnMinus=findViewById<Button>(R.id.btn_minus)
        val btnMul=findViewById<Button>(R.id.btn_mul)
        val btnDiv=findViewById<Button>(R.id.btn_div)

        val txtResult:TextView=findViewById(R.id.txt_result)



        btnSum.setOnClickListener {
            var numOne:Int=editNumOne.text.toString().toInt()
            var numTwo:Int=editNumTwo.text.toString().toInt()

            var result=numOne+numTwo
            txtResult.text=result.toString()


        }
        btnMinus.setOnClickListener {
            var numOne:Int=editNumOne.text.toString().toInt()
            var numTwo:Int=editNumTwo.text.toString().toInt()

            var result=numOne-numTwo
            txtResult.text=result.toString()
        }
        btnMul.setOnClickListener {
            var numOne:Int=editNumOne.text.toString().toInt()
            var numTwo:Int=editNumTwo.text.toString().toInt()

            var result2=numOne*numTwo
            txtResult.text=result2.toString()
        }
        btnDiv.setOnClickListener {
            var numOne:Int=editNumOne.text.toString().toInt()
            var numTwo:Int=editNumTwo.text.toString().toInt()

            var result3=numOne/numTwo
            txtResult.text=result3.toString()
        }

    }
}
