package com.codingwithmitch.koin

class MainRepositoryImp(private val api: MyApi):MainRepository
{
    override fun doNetworkCall()
    {
        api.callApi()
    }
}