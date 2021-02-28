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

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.AdoptionCase
import com.example.androiddevchallenge.screens.home_list_screen.LikeButtonView
import com.example.androiddevchallenge.ui.theme.DescriptionTextStyle
import com.example.androiddevchallenge.ui.theme.TitleTextStyle

@Composable
fun PetNameCardView(adoptionCase: AdoptionCase) {
    Row(
        modifier = Modifier
            .fillMaxWidth(0.8f)
            .padding(30.dp)
            .shadow(elevation = 10.dp, shape = RoundedCornerShape(30.dp))
            .background(
                shape = RoundedCornerShape(30.dp),
                color = Color.White
            )
    ) {

        Column(
            modifier = Modifier
                .weight(2f)
                .padding(start = 30.dp, end = 30.dp, top = 20.dp, bottom = 20.dp)
        ) {
            Text(
                text = adoptionCase.pet.name,
                style = TitleTextStyle
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Lorem ipsum dolor sit amet",
                style = DescriptionTextStyle
            )
        }

        Box(
            modifier = Modifier
                .weight(1f)
                .padding(0.dp),
            contentAlignment = Alignment.TopEnd
        ) {
            LikeButtonView(
                isPetLiked = adoptionCase.isFavourite,
                onLikeClicked = {
                    adoptionCase.isFavourite = !adoptionCase.isFavourite
                }
            )
        }
    }
}
