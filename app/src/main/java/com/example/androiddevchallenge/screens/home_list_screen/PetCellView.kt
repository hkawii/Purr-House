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
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTag
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.AdoptionCase
import com.example.androiddevchallenge.ui.theme.DescriptionTextStyle
import com.example.androiddevchallenge.ui.theme.PrimaryColor
import com.example.androiddevchallenge.ui.theme.TitleTextStyle

@Composable
fun PetCellView(adoptionCase: AdoptionCase, onPetSelected: (String) -> Unit) {
    Row(
        modifier = Modifier
            .semantics { testTag = "cell" }
            .clickable {
                onPetSelected(adoptionCase.id)
            }
            .padding(start = 10.dp, end = 10.dp)
            .shadow(elevation = 5.dp, shape = RoundedCornerShape(20.dp), clip = false)
            .background(
                shape = RoundedCornerShape(20.dp),
                color = Color.White
            )
            .fillMaxWidth()

    ) {
        Image(
            bitmap = ImageBitmap.imageResource(id = adoptionCase.pet.imageID),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp, 150.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .shadow(elevation = 10.dp)
        )

        Box() {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.End
            ) {
                LikeButtonView(
                    isPetLiked = adoptionCase.isFavourite,
                    onLikeClicked = {
                        adoptionCase.isFavourite = !adoptionCase.isFavourite
                    }
                )
            }

            Column(
                modifier = Modifier.padding(25.dp)
            ) {
                Text(
                    text = adoptionCase.pet.name,
                    style = TitleTextStyle,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                Text(
                    text = adoptionCase.petOwner.name,
                    style = DescriptionTextStyle,
                    modifier = Modifier.padding(bottom = 5.dp)
                )

                Spacer(modifier = Modifier.height(10.dp))

                Row {
                    Icon(
                        bitmap = ImageBitmap.imageResource(
                            id = if (adoptionCase.pet.isMale()) R.drawable.male else R.drawable.female
                        ),
                        contentDescription = "Gender Icon",
                        modifier = Modifier.size(20.dp),
                        tint = PrimaryColor
                    )

                    Spacer(modifier = Modifier.width(5.dp))

                    Text(text = adoptionCase.pet.gender, style = DescriptionTextStyle)

                    Spacer(modifier = Modifier.width(10.dp))

                    Icon(
                        bitmap = ImageBitmap.imageResource(id = R.drawable.clock),
                        contentDescription = "Age Icon",
                        modifier = Modifier.size(20.dp),
                        tint = PrimaryColor
                    )

                    Spacer(modifier = Modifier.width(5.dp))

                    Text(text = adoptionCase.pet.age.toString() + " Year", style = DescriptionTextStyle)
                }
            }
        }
    }
}
