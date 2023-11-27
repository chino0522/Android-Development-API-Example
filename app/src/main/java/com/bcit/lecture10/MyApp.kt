package com.bcit.lecture10

import android.app.Application
import com.bcit.lecture10.data.ArtRepository
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.gson.gson

class MyApp : Application() {
    private val client by lazy {
        HttpClient {
            install(ContentNegotiation) {
                gson()
            }
        }
    }

    val artRepository by lazy {
        ArtRepository(client)
    }
}