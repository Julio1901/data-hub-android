package com.example.datahub.investments.network

import com.example.datahub.investments.dto.InvestmentDTO
import com.example.datahub.investments.dto.PostDTO
import retrofit2.Response
import retrofit2.http.GET

interface InvestmentService {

    @GET("posts")
    suspend fun getPosts() : Response<List<PostDTO>>

    @GET("investments/")
    suspend fun getAllInvestments() : Response<List<InvestmentDTO>>

}