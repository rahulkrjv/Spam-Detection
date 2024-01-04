package com.skapps.android.csicodathonproject.data.models

/**
 * Created by Syed Umair on 17/12/2020.
 */

data class SUser(
    val name: String,
    val email: String,
    val admin: Boolean,
    val blocked: Boolean,
    val active: Boolean
)