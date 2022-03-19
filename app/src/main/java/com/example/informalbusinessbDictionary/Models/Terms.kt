package com.example.informalbusinessbDictionary.Models

import java.io.Serializable

data class Terms(
    var id: Long,
    var term: String,
    var translate: String
) : Serializable
