package com.example.sterk.volleydemo.model

import com.google.gson.annotations.SerializedName

/**
 * Created by sterk on 5/5/2019.
 */
data class PokemonName(
        @SerializedName("name")
        val name:String
)