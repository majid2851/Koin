package com.codingwithmitch.koin

import retrofit2.http.GET

interface MyApi
{
    @GET("")
    fun callApi()
}