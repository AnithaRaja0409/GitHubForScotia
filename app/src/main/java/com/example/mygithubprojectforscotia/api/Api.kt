package com.example.mygithubprojectforscotia.api

import com.example.mygithubprojectforscotia.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface Api {

    @GET("search/users")
    @Headers("Authorization: token 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")

    fun getSearchUsers(
        @Query(value = "q") query: String
    ): Call<UserResponse>


}