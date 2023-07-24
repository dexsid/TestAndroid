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
        bClass.btResult.setOnClickListener {
            val result = bClass.edValue.text.toString()
            bClass.tvAnswer.visibility = View.VISIBLE
            val tempText = ""

            when (result) {

                Constance.DVORNIK -> {
                    val temptext = "На вашу карту начисленно ${Constance.DVORNIK_SUELDO}"
                    bClass.tvAnswer.text = if (bClass.edValue2.text.toString() == Constance.DVORNIK_PASSWORD) {
                        temptext
                    }else {
                        "Не верный пароль"
                    }

                }
                Constance.BOSS -> {
                    val temptext = "На вашу карту начисленно ${Constance.BOSS_SUELDO}"
                    bClass.tvAnswer.text = if (bClass.edValue2.text.toString() == Constance.BOSS_PASSWORD) {
                        temptext
                    }else {
                        "Не верный пароль"
                    }

                }
                Constance.MEGABOSS -> {
                    val temptext = "На вашу карту начисленно ${Constance.MEGABOSS_SUELDO}"
                    bClass.tvAnswer.text = if (bClass.edValue2.text.toString() == Constance.MEGABOSS_PASSWORD) {
                        temptext
                    }else {
                        "Не верный пароль"
                    }
                }
                else -> {
                    bClass.tvAnswer.text = "Вы не являетесь сотрудником"
                }
            }

        }
    }


}