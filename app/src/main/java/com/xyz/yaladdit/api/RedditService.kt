package com.xyz.yaladdit.api

import com.xyz.yaladdit.api.model.TopResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RedditService {
    @GET("/top.json")
    fun getTop(@Query("after") after: String,
               @Query("limit") limit: String): Call<TopResponse>
}