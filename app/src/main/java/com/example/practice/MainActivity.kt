package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn0:Button=findViewById(R.id.btn0)//buttons containing numbers
        val btn1:Button=findViewById(R.id.btn1)
        val btn2:Button=findViewById(R.id.btn2)
        val btn3:Button=findViewById(R.id.btn3)
        val btn4:Button=findViewById(R.id.btn4)
        val btn5:Button=findViewById(R.id.btn5)
        val btn6:Button=findViewById(R.id.btn6)
        val btn7:Button=findViewById(R.id.btn7)
        val btn8:Button=findViewById(R.id.btn8)
        val btn9:Button=findViewById(R.id.btn9)
        val btnAc:Button=findViewById(R.id.btnAc)//button contains AC
        val btnDot:Button=findViewById(R.id.btnDot)

        val btnAdd:Button=findViewById(R.id.btnAdd)
        val btnSubstraction:Button=findViewById(R.id.btnSubstraction)
        val btnMultiplication:Button=findViewById(R.id.btnMultiplication)
        val btnDivision:Button=findViewById(R.id.btnDivision)
        val btnPoli:Button=findViewById(R.id.btnPoli)
        val btnEqual:Button=findViewById(R.id.btnEqual)
        val txt:TextView=findViewById(R.id.txt)

        var total:String=""
        var inDisplay:String=""

        var num1:Double=0.0
        var num2:Double=0.0
        var operation:String=""

        btn0.setOnClickListener(View.OnClickListener {
            inDisplay=txt.text.toString()
            total=inDisplay+0
            txt.setText(total)
        })
        btn1.setOnClickListener(View.OnClickListener {
            inDisplay=txt.text.toString()
            total=inDisplay+1
            txt.setText(total)
        })
        btn2.setOnClickListener(View.OnClickListener {
            inDisplay=txt.text.toString()
            total=inDisplay+2
            txt.setText(total)
        })
        btn3.setOnClickListener(View.OnClickListener {
            inDisplay=txt.text.toString()
            total=inDisplay+3
            txt.setText(total)
        })
        btn4.setOnClickListener(View.OnClickListener {
            inDisplay=txt.text.toString()
            total=inDisplay+4
            txt.setText(total)
        })
        btn5.setOnClickListener(View.OnClickListener {
            inDisplay=txt.text.toString()
            total=inDisplay+5
            txt.setText(total)
        })
        btn6.setOnClickListener(View.OnClickListener {
            inDisplay=txt.text.toString()
            total=inDisplay+6
            txt.setText(total)
        })
        btn7.setOnClickListener(View.OnClickListener {
            inDisplay=txt.text.toString()
            total=inDisplay+7
            txt.setText(total)
        })
        btn8.setOnClickListener(View.OnClickListener {
            inDisplay=txt.text.toString()
            total=inDisplay+8
            txt.setText(total)
        })
        btn9.setOnClickListener(View.OnClickListener {
            inDisplay=txt.text.toString()
            total=inDisplay+9
            txt.setText(total)
        })
        btnDot.setOnClickListener(View.OnClickListener {
            txt.setText(".")
        })

        btnAc.setOnClickListener(View.OnClickListener {
            txt.setText("")
        })


        btnAdd.setOnClickListener(View.OnClickListener {
            num1=txt.text.toString().toDouble()
            operation="+"
            txt.text=""

        })
        btnSubstraction.setOnClickListener(View.OnClickListener {//should be check just for testing purposes of git
            num1=txt.text.toString().toDouble()
            operation="-"
            txt.text=""

        })
        btnMultiplication.setOnClickListener(View.OnClickListener {//should be check just for testing purposes of git
            num1=txt.text.toString().toDouble()
            operation="*"
            txt.text=""

        })
        btnDivision.setOnClickListener(View.OnClickListener {
            num1=txt.text.toString().toDouble()
            operation="/"
            txt.text=""
        })
        btnPoli.setOnClickListener(View.OnClickListener {
            num1=txt.text.toString().toDouble()
            operation="%"
            txt.text=""
        })


        btnEqual.setOnClickListener(View.OnClickListener {
            num2=txt.text.toString().toDouble()
            var finalAnswer:Double=calculate(num1,num2,operation)
            txt.text=finalAnswer.toString()
        })







    }

    fun calculate(num1:Double,num2:Double,operation:String):Double{
        if(operation == "+")
            return num1+num2
        else if(operation == "-")
            return num1-num2
        else if(operation == "*")
            return num1*num2
        else if(operation == "/")
            return num1/num2
        else if(operation == "%")
            return num1*num2/100
        else
            return 0.0
    }
}