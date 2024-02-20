package com.example.myapplication

import org.publicvalue.multiplatform.oidc.OpenIdConnectClient

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}