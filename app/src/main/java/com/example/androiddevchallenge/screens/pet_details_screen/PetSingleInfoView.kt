package com.example.androiddevchallenge.screens.pet_details_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.ui.theme.PrimaryColor


@Composable
fun PetSingleInfoView(title : String, value : String, modifier: Modifier){
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold)
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = value,
            style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold, color = PrimaryColor),
            modifier = Modifier
                .background(shape = RoundedCornerShape(15.dp), color = Color.White)
                .shadow(elevation = 1.dp, shape = RoundedCornerShape(15.dp))
                .padding(start = 20.dp, top = 5.dp, end = 20.dp, bottom = 5.dp),
            textAlign = TextAlign.Center
        )
    }
}