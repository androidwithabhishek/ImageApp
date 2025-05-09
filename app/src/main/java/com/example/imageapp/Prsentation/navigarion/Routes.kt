package com.example.imageapp.Prsentation.navigarion

import kotlinx.serialization.Serializable

@Serializable
sealed class Routes
{
    @Serializable
    data object HomeScreen : Routes()


    @Serializable
    data object SearchScreen : Routes()


    @Serializable
    data object FevScreen : Routes()


    @Serializable
    data class FullScreen(val imageId: String) : Routes()

    @Serializable
    data class ProfileScreen(val profileLink: String) : Routes()
}