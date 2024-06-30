package com.example.starbucks.ui.pages

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.compose.StarbucksTheme
import com.example.starbucks.data.RewardRepository
import com.example.starbucks.ui.components.BottomNavigationBar
import com.example.starbucks.ui.components.RewardCard

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun RewardActivity(
    navHostController: NavHostController
) {
    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController = navHostController )
        }
    ) {
        RewardScreen()
    }
}

@Composable
fun RewardScreen() {
    val rewards = RewardRepository.rewards

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp)
    ) {
        Text(
            text = "Reward Options",
            fontWeight = FontWeight.SemiBold,
            fontSize = 24.sp
        )
        Text(
            modifier = Modifier.padding(vertical = 8.dp),
            text = "Claim your reward now!",
            fontSize = 14.sp
        )
        Spacer(modifier = Modifier.size(20.dp))
        LazyColumn {
            items(rewards) { reward ->
                RewardCard(
                    reward = reward,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
            }
        }
        Spacer(modifier = Modifier.size(20.dp))
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun RewardScreenPreview() {
    StarbucksTheme {
        RewardScreen()
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun RewardActivityPreview() {
    val navController = rememberNavController()
    StarbucksTheme {
        RewardActivity(navHostController = navController)
    }
}