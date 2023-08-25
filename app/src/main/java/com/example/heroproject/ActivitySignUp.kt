package com.example.heroproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.heroproject.databinding.ActivityMainBinding
import com.example.heroproject.databinding.ActivitySignUpBinding

class ActivitySignUp : AppCompatActivity() {
    lateinit var bClass: ActivitySignUpBinding
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bClass = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(bClass.root)
    }

}