package com.example.androiddevchallenge.screens.pet_details_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.data.AdoptionCase
import com.example.androiddevchallenge.data.FakePetsRequest
import com.example.androiddevchallenge.screens.home_list_screen.LikeButtonView
import com.example.androiddevchallenge.screens.home_list_screen.UserDetailsView
import com.example.androiddevchallenge.ui.theme.*

@Preview
@Composable
fun PetViewPreview(){
    val navController = rememberNavController()
    PetView(navController, "1")
}

@Composable
fun PetView(navController: NavController, caseID : String){

    val index = FakePetsRequest.indexOfFirst{ it.id == caseID }
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


