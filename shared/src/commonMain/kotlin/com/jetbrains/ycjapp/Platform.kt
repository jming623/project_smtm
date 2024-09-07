package com.jetbrains.ycjapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform