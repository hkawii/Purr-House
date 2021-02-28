package com.example.androiddevchallenge.screens.pet_details_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.AdoptionCase
import com.example.androiddevchallenge.ui.theme.BackgroundColor
import com.example.androiddevchallenge.ui.theme.PrimaryColor


@Composable
fun PetDetailsCardView(case: AdoptionCase){
    Column(
        modifier = Modifier
            .background(color = BackgroundColor)
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier.padding(start = 30.dp, end = 30.dp, bottom = 30.dp)
        ) {
            PetSingleInfoView("Age", case.pet.age.toString(), Modifier.weight(1f))
            PetSingleInfoView("Gender", case.pet.gender, Modifier.weight(1f))
            PetSingleInfoView("Weight", case.pet.weight.toString() + " kg", Modifier.weight(1f))
        }

        Divider(
            modifier = Modifier.padding(start = 30.dp, end = 30.dp, bottom = 30.dp),
            color = PrimaryColor,
            thickness = 1.dp
        )

        OwnerDetailsView(case)
    }
}
