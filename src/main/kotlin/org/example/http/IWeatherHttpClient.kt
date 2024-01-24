package org.example.http

interface IWeatherHttpClient {
    fun getWindForecast(city: String, days: Int = 5): String
}