package com.example.androiddevchallenge.screens.pet_details_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun BackButtonView(onBackClicked : () -> Unit){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight(0.5f),
        contentAlignment = Alignment.TopStart
    ){
        Button(
            onClick = {
                onBackClicked()
            },
            modifier = Modifier.padding(top = 50.dp, start = 20.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
            elevation = ButtonDefaults.elevation(defaultElevation = 0.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "Back Icon",
                tint = Color.White
            )
        }
    }
}