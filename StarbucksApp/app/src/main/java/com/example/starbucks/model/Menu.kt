package com.example.starbucks.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Menu(
    @StringRes val nameRes: Int,
    @StringRes val priceRes: Int,
    @DrawableRes val imageRes: Int
)
