package com.codingwithmitch.koin

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val appModule=module()
{
    single()
    {
        Retrofit.Builder()
            .baseUrl("http://google.com")
            //.addConverterFactory()
            .build()
            .create(MyApi::class.java)
    }
    single<MainRepository> {
        MainRepositoryImp(get())
    }
    viewModel {
        MainViewModel(get())
    }

}