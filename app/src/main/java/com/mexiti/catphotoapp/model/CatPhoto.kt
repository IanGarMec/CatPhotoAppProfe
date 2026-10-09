package com.mexiti.catphotoapp.model

import android.annotation.SuppressLint
import kotlinx.serialization.Serializable

@SuppressLint("UnsafeOptInUsageError")
@Serializable
data class CatPhoto(
    val id:String,
    val url:String,
    val width: Int,
    val height:Int,
)
