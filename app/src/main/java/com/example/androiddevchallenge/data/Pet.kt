package com.example.androiddevchallenge.data

data class Pet(
    val name : String,
    val age : Double,
    val gender : String,
    val weight : Double,
    val imageID : Int
){
    fun isMale() : Boolean{
        return gender == "Male"
    }
}