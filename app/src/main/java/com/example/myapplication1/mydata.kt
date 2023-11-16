package com.example.myapplication1

class mydata {
    companion object
    {
        var users = mutableListOf<User>()
        var loggedInUser =User("","","","","",)
    }
}
class User(var name :String,var email:String,var password:String,var countery:String,var role:String)