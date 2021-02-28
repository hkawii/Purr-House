/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.screens.home_list_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
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
fun SearchView() {
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
