package org.example.http

import java.net.URI
import java.net.URLEncoder
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

class WeatherHttpClient : IWeatherHttpClient {

    private val apikey: String = ""

    override fun getWindForecast(city: String, days: Int): String {
        val cityEncoded = URLEncoder.encode(city, "UTF-8")

        val url = "https://api.openweathermap.org/data/2.5/forecast?q=${cityEncoded}&appid=$apikey"

        val client = HttpClient.newHttpClient()
        val request = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create(url))
            .build()

        val response = client.send(request, HttpResponse.BodyHandlers.ofString())

        if (response.statusCode() == 200) {
            return response.body()
        } else {
            throw Exception("Error: ${response.statusCode()}")
        }
    }
}