package com.example.starbucks.data

import com.example.starbucks.R
import com.example.starbucks.model.Reward

object RewardRepository {
    val rewards = listOf(
        Reward(
            titleRes = R.string.reward_1_title,
            descriptionRes = R.string.reward_1_description,
            imageRes = R.drawable.drink_2
        ),
        Reward(
            titleRes = R.string.reward_2_title,
            descriptionRes = R.string.reward_2_description,
            imageRes = R.drawable.drink_6
        ),
        Reward(
            titleRes = R.string.reward_3_title,
            descriptionRes = R.string.reward_3_description,
            imageRes = R.drawable.drink_4
        ),
    )
}