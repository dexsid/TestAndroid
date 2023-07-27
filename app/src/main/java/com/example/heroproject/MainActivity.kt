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

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bClass.root)

    }


}