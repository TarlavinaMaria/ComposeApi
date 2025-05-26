package com.example.composeapi

import retrofit2.http.GET


interface ApiService {
    @GET("shows")
    suspend fun getShows(): List<Show>
}