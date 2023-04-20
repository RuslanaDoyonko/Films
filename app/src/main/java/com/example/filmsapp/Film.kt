package com.example.filmsapp

import androidx.annotation.DrawableRes

data class Film(
    val title: String,
    val description: String,
    val rating: Float,
    @DrawableRes val pictureRes: Int
) {

    companion object {
        val filmsList = listOf(
            Film(
                title = "Star Wars",
                description = "This film about the far far away galaxy.",
                rating = 4.0f,
                pictureRes = R.drawable.star_wars
            ),
            Film(
                title = "Sherlock Holmes",
                description = "Story about the greatest detective.",
                rating = 4.5f,
                pictureRes = R.drawable.sherlock_holmes
            ),
            Film(
                title = "Police academy",
                description = "Old, but still very good comedy about police.",
                rating = 5.0f,
                pictureRes = R.drawable.police_academy
            ),
            Film(
                title = "Jackie Chan",
                description = "Always in our hearts adventures comedy.",
                rating = 4.5f,
                pictureRes = R.drawable.jackie_chan
            ),
            Film(
                title = "The Shawshank Redemption",
                description = "Story about running from jail-island.",
                rating = 3.5f,
                pictureRes = R.drawable.the_shawshank_redemption
            )
        )
    }

}
