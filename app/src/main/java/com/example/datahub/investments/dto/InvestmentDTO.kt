package com.example.datahub.investments.dto

import com.google.gson.annotations.SerializedName

data class InvestmentDTO(
     val id: Int,
     val name: String,
     @SerializedName("monetary_value")
     val monetaryValue: String,
     @SerializedName("bank_name")
     val bankName: String,
     val type: String
)