package com.example.musify.ui.screens.searchscreen

import androidx.compose.ui.graphics.Color
import com.example.musify.R
import com.example.musify.domain.Genre

/**
 * Used to get the associated image resource id of the [Genre.GenreType].
 */
fun Genre.GenreType.getAssociatedImageResource(): Int = when (this) {
    Genre.GenreType.AMBIENT -> R.drawable.genre_img_ambient
    Genre.GenreType.CHILL -> R.drawable.genre_img_chill
    Genre.GenreType.CLASSICAL -> R.drawable.genre_img_classical
    Genre.GenreType.DANCE -> R.drawable.genre_img_dance
    Genre.GenreType.ELECTRONIC -> R.drawable.genre_img_electronic
    Genre.GenreType.METAL -> R.drawable.genre_img_metal
    Genre.GenreType.RAINY_DAY -> R.drawable.genre_img_rainy_day
    Genre.GenreType.ROCK -> R.drawable.genre_img_rock
    Genre.GenreType.PIANO -> R.drawable.genre_img_piano
    Genre.GenreType.POP -> R.drawable.genre_img_pop
    Genre.GenreType.SLEEP -> R.drawable.genre_img_sleep
}

/**
 * Used to get the associated background color of the [Genre.GenreType].
 * They were directly scraped from the official spotify web app.
 * Note: Certain colors may not match with the official app. This
 * is because, all genres listed in the api where not listed in the
 * spotify web app.
 */
fun Genre.GenreType.getAssociatedBackgroundColor() = when (this) {
    Genre.GenreType.AMBIENT -> Color(0xFFA3006B)
    Genre.GenreType.CHILL -> Color(0xFF14452F)
    Genre.GenreType.CLASSICAL -> Color(0xFF4B006E)
    Genre.GenreType.DANCE -> Color(0xFF0041C2)
    Genre.GenreType.ELECTRONIC -> Color.LightGray
    Genre.GenreType.METAL -> Color(0xFFA3006B)
    Genre.GenreType.RAINY_DAY -> Color(0xFF964B00)
    Genre.GenreType.ROCK -> Color.Magenta
    Genre.GenreType.PIANO -> Color.Red
    Genre.GenreType.POP -> Color.Blue
    Genre.GenreType.SLEEP -> Color.Cyan
}