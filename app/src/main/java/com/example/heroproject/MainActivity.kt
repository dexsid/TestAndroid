package com.example.heroproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.heroproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bClass: ActivityMainBinding
    val a:Byte = 26
    val b:Byte = 6

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bClass.root)
        var result = 0
        var textResult = "Результат: "

        bClass.b1.setOnClickListener{
            result = a + b
            bClass.t2.text = "Результат: $result"
        }
        bClass.b2.setOnClickListener{
            result = a * b
            bClass.t2.text = "Результат: $result"
        }
        bClass.b3.setOnClickListener{
            result = a - b
            bClass.t2.text = "Результат: $result"
        }
        bClass.b4.setOnClickListener{
            result = a / b
            bClass.t2.text = "Результат: $result"
        }

    }


}