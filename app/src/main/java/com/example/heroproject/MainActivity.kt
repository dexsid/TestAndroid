package com.example.heroproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.heroproject.constance.Constance
import com.example.heroproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
        lateinit var bClass: ActivityMainBinding
        private var login:String = "empty"
        private var password:String = "empty"
        private var name:String = "empty"
        private var last_name:String = "empty"
        private var surname:String = "empty"
        private var avatarImageId:Int = 0

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bClass.root)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == Constance.REQUEST_CODE_SIGN_IN){

        }else if (requestCode == Constance.REQUEST_CODE_SIGN_UP){

        }
    }

    fun onClickSignIn(view: View){
        val intent = Intent(this,  ActivitySignUp::class.java)
        intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_IN_STATE)
        startActivityForResult(intent,Constance.REQUEST_CODE_SIGN_IN)



    }
    fun onClickSignUp(view: View){
        val intent = Intent(this,  ActivitySignUp::class.java)
        intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_UP_STATE)
        startActivityForResult(intent,Constance.REQUEST_CODE_SIGN_UP)
    }


}