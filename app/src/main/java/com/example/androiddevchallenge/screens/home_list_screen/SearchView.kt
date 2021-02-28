package com.example.androiddevchallenge.screens.home_list_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.BackgroundColor


@Composable
fun SearchView(){
    val textState = remember { mutableStateOf("") }

    Row(
        modifier = Modifier
            .padding(top = 20.dp, bottom = 20.dp)
    ) {

        TextField(
            value = textState.value,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Search Icon",
                    tint = Color.Gray
                )
            },
            onValueChange = { newValue ->
                textState.value = newValue
            },
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                backgroundColor = Color.White
            ),
            shape = RoundedCornerShape(12.dp),
            label = {
                Text(text = "Search here ...", color = BackgroundColor)
            },
            modifier = Modifier
                .shadow(10.dp)
                .fillMaxWidth(0.8f),
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Search
            )
        )

        Spacer(modifier = Modifier.width(20.dp))

        Button(
            onClick = {
                /*TODO*/
            },
            modifier = Modifier.size(55.dp)
        ) {
            Image(
                bitmap = ImageBitmap.imageResource(id = R.drawable.qrcode),
                contentDescription = "QRCode Button",
                modifier = Modifier
                    .shadow(elevation = 5.dp)
                    .fillMaxSize()
            )
        }
    }

}
