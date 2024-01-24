package org.example

import kotlinx.serialization.json.Json
import org.example.http.IWeatherHttpClient
import org.example.http.model.WeatherModel
import java.util.*

class WindForecastService(
    private val weatherHttpClient: IWeatherHttpClient,
) {

    private val json = Json { ignoreUnknownKeys = true }

    /**
     * A windy session is time when the wind is more that 5 m/s and the gust is more than 10 m/s
     */
    fun getWindySession(): List<Date> {
        val jsonStr = weatherHttpClient.getWindForecast("Tel Aviv")

        val weatherModel: WeatherModel = json.decodeFromString(jsonStr)
        TODO()
    }
}
