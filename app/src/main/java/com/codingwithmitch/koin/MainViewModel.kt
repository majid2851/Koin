package com.codingwithmitch.koin

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel(private val repository: MainRepository):ViewModel()
{


    fun doNetworkCall(){
        Log.i("mag2851","majid")
//        repository.doNetworkCall()
    }
}