package com.norsedreki.kmp.sandbox

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform