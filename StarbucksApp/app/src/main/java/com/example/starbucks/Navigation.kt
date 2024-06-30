package com.example.starbucks

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.starbucks.ui.pages.RewardActivity
import com.example.starbucks.ui.pages.MenuActivity
import com.example.starbucks.ui.pages.SignInScreen
import com.example.starbucks.ui.pages.SignUpScreen
import com.example.starbucksapp.screens.StartScreen

sealed class Route {
    data class SplashScreen(val name: String = "Splash")
    data class SignInScreen(val name: String = "SignIn"): Route()
    data class SignUpScreen(val name: String = "SignUp"): Route()
    data class MenuScreen(val name: String = "Menu"): Route()
    data class RewardScreen(val name: String = "Reward")
}

@Composable
fun MyNavigation(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = Route.SplashScreen().name
    ) {
        composable(route = Route.SplashScreen().name) {
            StartScreen(
                navHostController
            )
        }
        composable(route = Route.SignInScreen().name) {
            SignInScreen(
                onSignInClick = {
                    navHostController.navigate(
                        Route.MenuScreen().name
                    )
                },
                onSignUpClick = {
                    navHostController.navigate(
                        Route.SignUpScreen().name
                    )
                }
            )
        }

        composable(route = Route.SignUpScreen().name) {
            SignUpScreen(
                onSignUpClick = {
                    navHostController.navigate(
                        Route.MenuScreen().name
                    )
                },
                onSignInClick = {
                    navHostController.navigate(
                        Route.SignInScreen().name
                    )
                }
            )
        }

        composable(route = Route.MenuScreen().name) {
            MenuActivity(
                navHostController
            )
        }

        composable(route = Route.RewardScreen().name) {
            RewardActivity(
                navHostController
            )
        }
    }
}