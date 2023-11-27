package com.bcit.lecture10

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import com.bcit.lecture10.data.ArtRepository
import com.bcit.lecture10.ui.main.ArtState
import com.bcit.lecture10.ui.theme.Lecture10Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val artRepository = (application as MyApp).artRepository

        setContent {

            val artState = ArtState(artRepository)

            LaunchedEffect(
                key1 = artState,
                block = {
                artState.getArtwork()
            })

            MainContent(artState)

        }
    }
}

@Composable
fun MainContent(artState: ArtState) {
    LazyColumn(content = {
        items(artState.artwork.value.size) {
            Text(text = artState.artwork.value[it].title)
            AsyncImage(model = artState.getImageUrl(artState.artwork.value[it].image), contentDescription = null)
        }
    })
}
