package com.bcit.lecture10.ui.main

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.bcit.lecture10.data.ArtPiece
import com.bcit.lecture10.data.ArtRepository

class ArtState(
    private val artRepository: ArtRepository
) {
    var artwork: MutableState<List<ArtPiece>> = mutableStateOf(emptyList())

    suspend fun getArtwork() {
        artwork.value = artRepository.getArtWork().pieces
    }
    fun getImageUrl(url: String) : String{
        return artRepository.getImageUrl(url)
    }
}