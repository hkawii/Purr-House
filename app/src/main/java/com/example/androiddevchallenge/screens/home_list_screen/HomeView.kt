package com.example.androiddevchallenge.screens.home_list_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.theme.PurrHouseTheme

@Preview
@Composable
fun HomeViewPreview(){
    val navController = rememberNavController()
    HomeView(navController)
}

@Composable
fun HomeView(navController: NavController){
    PurrHouseTheme {
        Surface(color = MaterialTheme.colors.background) {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                HeaderView()
                PetsContainerView(onPetSelected = { id ->
                    navController.navigate("pet_screen/$id")
                })
            }
        }
    }
}

