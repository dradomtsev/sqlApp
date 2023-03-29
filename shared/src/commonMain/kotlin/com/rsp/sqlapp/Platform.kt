package com.rsp.sqlapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform