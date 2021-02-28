package com.example.androiddevchallenge.screens.home_list_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R


@Composable
fun HeaderView(){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(start = 30.dp, end = 30.dp, bottom = 30.dp, top = 50.dp)
    ) {

        UserDetailsView(
            name = "Earl Kim",
            title = "Cairo, Egypt",
            modifier = Modifier.weight(3f)
        )

        Image(
            bitmap = ImageBitmap.imageResource(id = R.drawable.logo),
            contentDescription = "Logo Image",
            modifier = Modifier
                .weight(1f)
                .height(20.dp)
        )
    }
}