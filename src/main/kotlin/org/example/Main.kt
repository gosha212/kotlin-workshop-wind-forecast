package org.example

import org.example.http.WeatherHttpClientMock

fun main() {
    val windForecastManager = WindForecastService(
        weatherHttpClient = WeatherHttpClientMock()
    )

    val windyDays = windForecastManager.getWindyDays()

}