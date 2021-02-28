package com.example.androiddevchallenge.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.screens.home_list_screen.HomeView
import com.example.androiddevchallenge.screens.pet_details_screen.PetView

@Composable
fun ComposeNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "home_screen"
    ) {
        composable("home_screen"){
            HomeView(navController = navController)
        }
        composable("pet_screen/{caseID}") { backStackEntry ->
            backStackEntry.arguments?.getString("caseID")?.let { PetView(navController, it) }
        }
    }
}