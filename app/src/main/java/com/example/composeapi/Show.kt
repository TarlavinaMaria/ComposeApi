package com.example.composeapi

/**
 * Created by sizik on 26.05.2025.
 */
data class Show(val id: Int, val name: String, val image: Image?, val summary: String?)

data class Image(val medium: String, val original: String)