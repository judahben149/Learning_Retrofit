package com.judahben149.learningretrofit.data.model

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("avatar")
    val picture: String,
    @SerializedName("email")
    val userEmail: String,
    @SerializedName("id")
    val userId: String,
    @SerializedName("name")
    val userName: String
)
