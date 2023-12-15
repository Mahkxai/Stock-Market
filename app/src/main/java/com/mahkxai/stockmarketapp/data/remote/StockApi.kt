package com.mahkxai.stockmarketapp.data.remote

import retrofit2.http.GET
import retrofit2.http.Query


interface StockApi {

    @GET("query?function=LISTING_STATUS")
    suspend fun getListings(
        @Query("apikey") apiKey: String
    )

    companion object {
        const val API_KEY = "J98DK9SIQDLUDAK3"
        const val BASE_URL = "https://www.alphavantage.co/"
    }
}