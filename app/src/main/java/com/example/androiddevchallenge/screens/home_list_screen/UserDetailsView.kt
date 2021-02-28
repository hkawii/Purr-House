package com.example.androiddevchallenge.screens.home_list_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.DescriptionTextStyle
import com.example.androiddevchallenge.ui.theme.TitleTextStyle


@Composable
fun UserDetailsView(name : String, title : String, modifier: Modifier = Modifier){
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            bitmap = ImageBitmap.imageResource(id = R.drawable.user_image),
            contentDescription = "User Image",
            modifier = Modifier
                .clip(CircleShape)
                .size(50.dp),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier.padding(start = 20.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = name,
                style = TitleTextStyle
            )
            Text(
                text = title ,
                style = DescriptionTextStyle
            )
        }
    }

}

