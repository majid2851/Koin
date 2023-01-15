package com.codingwithmitch.koin

import org.koin.core.qualifier.named
import org.koin.core.qualifier.qualifier
import org.koin.dsl.module

val activityModule = module()
{
    scope<MainActivity>()
    {
        scoped(qualifier= named("hello")) { "hello2851" }
        scoped(qualifier= named("2851")) { "656565" }
    }
}