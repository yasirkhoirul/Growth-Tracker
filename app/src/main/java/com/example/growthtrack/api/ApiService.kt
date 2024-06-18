package com.example.growthtrack.api

import retrofit2.Call
import retrofit2.Callback
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {

    @GET("predictionHistory/")
    @Headers("Authorization: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOiJUazVKRkZMNkpoaFlucGtZQ0tJUFFzNm1PaEozIiwiZW1haWwiOiJ5YXNpcmh1ZGFAZ21haWwuY29tIiwiaWF0IjoxNzE4NzAyNTMzLCJleHAiOjE3MTg3MDYxMzN9.7ahvcAz3FkEy5HEAc9Z2h2OuChjJpEstlQvaUtZpvD4")
    fun getHistory():Call<Response>


    @POST("predict")
    @Headers("Authorization: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOiJUazVKRkZMNkpoaFlucGtZQ0tJUFFzNm1PaEozIiwiZW1haWwiOiJ5YXNpcmh1ZGFAZ21haWwuY29tIiwiaWF0IjoxNzE4NzAyNTMzLCJleHAiOjE3MTg3MDYxMzN9.7ahvcAz3FkEy5HEAc9Z2h2OuChjJpEstlQvaUtZpvD4")
    fun postpredict(
        @Body request: PredictRequest
    ):Call<Postpredict>

    @GET("users/{id}")
    @Headers("Authorization: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOiJUazVKRkZMNkpoaFlucGtZQ0tJUFFzNm1PaEozIiwiZW1haWwiOiJ5YXNpcmh1ZGFAZ21haWwuY29tIiwiaWF0IjoxNzE4NzAyNTMzLCJleHAiOjE3MTg3MDYxMzN9.7ahvcAz3FkEy5HEAc9Z2h2OuChjJpEstlQvaUtZpvD4")
    fun getuser(
        @Path("id") id: String
    ): Call<UsersResponse>
    @FormUrlEncoded
    @POST("resetpassword")
    fun sendEmail(
        @Field("email") email: String
    ): Call<ResetRespon>
}