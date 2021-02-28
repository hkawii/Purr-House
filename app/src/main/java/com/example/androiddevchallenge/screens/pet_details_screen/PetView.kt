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

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.data.FakePetsRequest
import com.example.androiddevchallenge.ui.theme.PurrHouseTheme

@Preview
@Composable
fun PetViewPreview() {
    val navController = rememberNavController()
    PetView(navController, "1")
}

@Composable
fun PetView(navController: NavController, caseID: String) {

    val index = FakePetsRequest.indexOfFirst { it.id == caseID }
    val adoptionCase = remember { FakePetsRequest[index] }

    PurrHouseTheme {
        Surface(color = MaterialTheme.colors.background) {
            Column {
                PetImageView(
                    adoptionCase = adoptionCase,
                    onBackClicked = {
                        navController.popBackStack()
                    }
                )
                PetDetailsCardView(adoptionCase)
            }
        }
    }
}
