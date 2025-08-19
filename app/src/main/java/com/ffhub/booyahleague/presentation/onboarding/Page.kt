package com.ffhub.booyahleague.presentation.onboarding

import androidx.annotation.DrawableRes
import com.ffhub.booyahleague.R

data class Page(
    val title : String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Booyah League \uD83C\uDFAE",
        description = "Your gateway to Free Fire tournaments. Register, play, and win!",
        image = R.drawable.onboarding_welcome
    ),
    Page(
        title = "Join Tournaments \uD83C\uDFC6",
        description = "Register your squad, play in epic battles, and climb the leaderboard.",
        image = R.drawable.onboarding_tournament
    ),
    Page(
        title = "Track Your Progress \uD83D\uDCCA",
        description = "Get real-time match updates and follow your team’s journey to the top.",
        image = R.drawable.onboarding_progress
    ),
    Page(
        title = "Terms and Condition",
        description = "By clicking 'Continue', you agree to our Terms & Conditions.",
        image = R.drawable.onboarding_terms
    )
)
