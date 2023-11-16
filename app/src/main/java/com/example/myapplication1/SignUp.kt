package com.example.myapplication1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.content.UnusedAppRestrictionsBackportCallback

class SignUp : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)

        var edName =findViewById<EditText>(R.id.person_name)
        var edemail =findViewById<EditText>(R.id.id_email)
        var edpasword =findViewById<EditText>(R.id.id_password)
        var edcount =findViewById<Spinner>(R.id.sp_count)
        var edrole =findViewById<Spinner>(R.id.sp_role)
        var Btn =findViewById<Button>(R.id.Btn_2)


        Btn.setOnClickListener{
              var edNameText=edName.text.toString()
              var edemailText=edemail.text.toString()
              var edpaswordText=edpasword.text.toString()
              var edcountText=edcount.selectedItem.toString()
              var edroleText=edrole.selectedItem.toString()

if (edNameText==""||edemailText==""||edpaswordText==""){
    Toast.makeText(this,"InPut requierd",Toast.LENGTH_SHORT).show()

}
else{
    var u= User(edNameText,edemailText,edpaswordText,edcountText,edroleText)


    mydata.users.add(u)

    finish()

}




          }
        var d=findViewById<TextView>(R.id.Log)
        d.setOnClickListener{
            var d= android.content.Intent(this,MainActivity::class.java)
            startActivity(d)

        }
    }
}