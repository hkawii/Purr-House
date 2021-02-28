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
fun LikeButtonView(isPetLiked: Boolean, onLikeClicked: () -> Unit) {
    val isLiked = remember { mutableStateOf(isPetLiked) }

    val bgColor = if (isLiked.value) PrimaryColor else Color.LightGray

    Button(
        onClick = {
            isLiked.value = !isLiked.value
            onLikeClicked()
        },
        modifier = Modifier.size(50.dp),
        shape = RoundedCornerShape(topStart = 0.dp, topEnd = 20.dp, bottomEnd = 0.dp, bottomStart = 20.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = bgColor)
    ) {
        Image(
            bitmap = ImageBitmap.imageResource(id = R.drawable.like),
            contentDescription = "like image",
            modifier = Modifier.padding(1.dp)
        )
    }
}
