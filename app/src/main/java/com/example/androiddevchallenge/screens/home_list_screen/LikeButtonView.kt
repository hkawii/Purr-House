package com.example.androiddevchallenge.screens.home_list_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.PrimaryColor


@Composable
fun LikeButtonView(isPetLiked : Boolean, onLikeClicked : () -> Unit){
    val isLiked = remember{ mutableStateOf(isPetLiked) }

    val bgColor = if (isLiked.value) PrimaryColor else Color.LightGray

    Button(onClick = {
        isLiked.value = !isLiked.value
        onLikeClicked()
    },
        modifier = Modifier.size(50.dp),
        shape = RoundedCornerShape(topStart = 0.dp, topEnd = 20.dp, bottomEnd = 0.dp, bottomStart = 20.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = bgColor)
    ) {
        Image(
            bitmap = ImageBitmap.imageResource(id = R.drawable.like),
            contentDescription =  "like image",
            modifier = Modifier.padding(1.dp)
        )
    }
}