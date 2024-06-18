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
import retrofit2.http.Query

interface ApiService {

    @GET("predictionHistory/")
    @Headers("Authorization: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOiJUazVKRkZMNkpoaFlucGtZQ0tJUFFzNm1PaEozIiwiZW1haWwiOiJ5YXNpcmh1ZGFAZ21haWwuY29tIiwiaWF0IjoxNzE4NzE3MTY0LCJleHAiOjE3MTg3MjA3NjR9.BY4fMJPxY7p0tG9sAoBRkp0jlyPEVsAr_eFuJ0Xoz4M")
    fun getHistory():Call<Response>


    @POST("predict")
    @Headers("Authorization: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOiJUazVKRkZMNkpoaFlucGtZQ0tJUFFzNm1PaEozIiwiZW1haWwiOiJ5YXNpcmh1ZGFAZ21haWwuY29tIiwiaWF0IjoxNzE4NzE3MTY0LCJleHAiOjE3MTg3MjA3NjR9.BY4fMJPxY7p0tG9sAoBRkp0jlyPEVsAr_eFuJ0Xoz4M")
    fun postpredict(
        @Body request: PredictRequest
    ):Call<Postpredict>

    @GET("users/{id}")
    @Headers("Authorization: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOiJUazVKRkZMNkpoaFlucGtZQ0tJUFFzNm1PaEozIiwiZW1haWwiOiJ5YXNpcmh1ZGFAZ21haWwuY29tIiwiaWF0IjoxNzE4NzE3MTY0LCJleHAiOjE3MTg3MjA3NjR9.BY4fMJPxY7p0tG9sAoBRkp0jlyPEVsAr_eFuJ0Xoz4M")
    fun getuser(
        @Path("id") id: String
    ): Call<UsersResponse>
    @FormUrlEncoded
    @POST("resetpassword")
    fun sendEmail(
        @Field("email") email: String
    ): Call<ResetRespon>

    interface PlacesApiService {
        @GET("nearbysearch/json")
        fun getNearbyPlaces(
            @Query("location") location: String,
            @Query("radius") radius: Int,
            @Query("type") type: String,
            @Query("key") apiKey: String
        ): Call<PlacesResponse>
    }

}