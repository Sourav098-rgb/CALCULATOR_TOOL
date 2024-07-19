package com.example.relativelayout

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculator_tool.R

class logic_task : AppCompatActivity() {
    var btn:Button?=null
    var btn1:Button?=null
    var btn2:Button?=null
    var btn3:Button?=null
    var btn4:Button?=null
    var text:EditText?=null

    var num=0.0f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_logic_task)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btn=findViewById(R.id.Next)
        btn1=findViewById(R.id.btnadd)
        btn2=findViewById(R.id.btnsub)
        btn3=findViewById(R.id.btndiv)
        btn4=findViewById(R.id.btnmul)
        text=findViewById(R.id.Entertext)

        btn1?.setOnClickListener{
            num+=2
            text?.setText(num.toString())
        }

        btn2?.setOnClickListener{
            num-=2
            if(num<0){
                num=0.0f
            }
            text?.setText(num.toString())
        }
        btn3?.setOnClickListener{
            num/=2
            text?.setText(num.toString())
        }
        btn4?.setOnClickListener{
            num*=num
            text?.setText(num.toString())
        }




    }
}