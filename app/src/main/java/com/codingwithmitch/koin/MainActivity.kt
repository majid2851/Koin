package com.codingwithmitch.koin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.koin.android.ext.android.inject
import org.koin.android.scope.AndroidScopeComponent
import org.koin.androidx.scope.activityRetainedScope
import org.koin.androidx.scope.activityScope
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import org.koin.core.scope.Scope
import kotlin.math.log

class MainActivity : AppCompatActivity(),AndroidScopeComponent
{
//    private val viewModel by viewModel<MainViewModel>()
    lateinit var viewModel: MainViewModel
    override val scope: Scope by activityRetainedScope()
    private val hello by inject<String>(named("hello"))

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("mag2851",hello)
        viewModel=getViewModel<MainViewModel>()
        viewModel.doNetworkCall()
    }


}