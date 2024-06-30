package com.example.starbucks.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Reward(
    @StringRes val titleRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)
