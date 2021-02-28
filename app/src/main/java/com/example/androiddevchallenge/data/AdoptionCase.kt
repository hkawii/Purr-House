package com.example.androiddevchallenge.data

data class AdoptionCase(
    val id : String,
    val pet : Pet,
    val petOwner : PetOwner,
    var isFavourite : Boolean = false,
    val description : String
)