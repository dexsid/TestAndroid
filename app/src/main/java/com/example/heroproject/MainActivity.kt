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
    val maxPerson = 90
    var currentPerson = 26

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bClass.root)


        bClass.b1.setOnClickListener{
           if(maxPerson > currentPerson){
               bClass.t2.text = "Можно работать"
            }
           else
               bClass.t2.text = "Входить новым покупателям запрещено"
        }
        bClass.b2.setOnClickListener{
            currentPerson = 120

        }
        bClass.b3.setOnClickListener{

        }
        bClass.b4.setOnClickListener{

        }

    }


}