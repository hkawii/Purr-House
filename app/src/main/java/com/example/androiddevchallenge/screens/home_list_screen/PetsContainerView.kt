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

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.FakePetsRequest
import com.example.androiddevchallenge.ui.theme.BackgroundColor
import com.example.androiddevchallenge.ui.theme.TitleTextStyle

@Composable
fun PetsContainerView(onPetSelected: (String) -> Unit) {
    val adoptionList = remember { FakePetsRequest }
    LazyColumn(
        modifier = Modifier
            .background(shape = RoundedCornerShape(30.dp), color = BackgroundColor)
            .fillMaxSize()
            .padding(start = 30.dp, end = 30.dp, top = 30.dp, bottom = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        item {
            SearchView()
        }

        item {
            Text(
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp, top = 20.dp, bottom = 30.dp)
                    .fillMaxWidth(),
                text = "Latest Pets",
                style = TitleTextStyle
            )
        }

        items(adoptionList) { adoptionCase ->
            PetCellView(
                adoptionCase = adoptionCase,
                onPetSelected = onPetSelected
            )
            Spacer(modifier = Modifier.height(50.dp))
        }
    }
}
