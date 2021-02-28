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
package com.example.androiddevchallenge.screens.pet_details_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
fun PetImageView(adoptionCase: AdoptionCase, onBackClicked: () -> Unit) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.5f),
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.BottomCenter
        ) {

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
