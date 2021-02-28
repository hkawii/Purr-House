package com.example.androiddevchallenge.screens.pet_details_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.AdoptionCase
import com.example.androiddevchallenge.ui.theme.BackgroundColor


@Composable
fun PetImageView(adoptionCase: AdoptionCase, onBackClicked : () -> Unit){

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.5f),
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.BottomCenter
        ){

            Image(
                bitmap = ImageBitmap.imageResource(id = adoptionCase.pet.imageID),
                contentDescription = "Pet Image",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Box(
                modifier = Modifier
                    .background(
                        shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp),
                        color = BackgroundColor
                    )
                    .height(50.dp)
                    .fillMaxWidth()
            )

            PetNameCardView(adoptionCase)
        }

        BackButtonView(onBackClicked)
    }
}