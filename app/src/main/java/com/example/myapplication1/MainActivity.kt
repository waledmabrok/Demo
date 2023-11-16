package com.example.myapplication1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

import android.content.Intent as Intent1



 class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var edEmail=findViewById<EditText>(R.id.id_email)
       var edpasword=findViewById<EditText>(R.id.id_password)
       var btnlog =findViewById<Button>(R.id.btn_1)
           btnlog.setOnClickListener{
var edEmailText=edEmail.text.toString()
var edpaswordText=edpasword.text.toString()


if (edEmailText.trim()==""||edpaswordText.trim()==""){
    Toast.makeText(this,"InPut Requierd",Toast.LENGTH_SHORT).show()

}else{
    var exit=true
    for(p in mydata.users){
        if(p.email==edEmailText&& p.password==edpaswordText){
            exit=false
            mydata.loggedInUser.name=p.name
            mydata.loggedInUser.email=p.email
            mydata.loggedInUser.password=p.password
            mydata.loggedInUser.countery=p.countery
            mydata.loggedInUser.role=p.role
            if(p.role=="Super Admin"){
                var btn= android.content.Intent(this,HomeActivity::class.java)
                startActivity(btn)

                break;
            }else if(p.role=="Admin"){
                var btn= android.content.Intent(this,Admin::class.java)
                startActivity(btn)

                break;
            }


        }
    }
    if(exit==true){
        Toast.makeText(this,"Not found",Toast.LENGTH_SHORT).show()
    }
}

        }

        var acc =findViewById<TextView>(R.id.sign)
            acc.setOnClickListener{
    var ac= android.content.Intent(this,SignUp::class.java)
    startActivity(ac)
}

    }

 }