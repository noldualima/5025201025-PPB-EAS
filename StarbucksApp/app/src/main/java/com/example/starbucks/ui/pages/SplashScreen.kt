package com.example.starbucksapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.compose.backgroundLight
import com.example.starbucks.R
import com.example.starbucks.Route
//import com.example.starbucks.navigation.SIGNIN_SCREEN
//import com.example.starbucks.ui.theme.Background
import kotlinx.coroutines.delay


@Composable
fun StartScreen(
    navHostController: NavHostController
) {

    LaunchedEffect(key1 = true){
        delay(2000)
        navHostController.navigate(Route.SignInScreen().name)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundLight), contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "",
            modifier = Modifier.size(150.dp)
        )
    }

}