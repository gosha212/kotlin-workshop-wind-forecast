package org.example.http.model

import kotlinx.serialization.Serializable


@Serializable
data class WeatherModel(
    val list: List<WeatherData> // list is the name of the field in the JSON
)

@Serializable
data class WeatherData(val dt: Long)