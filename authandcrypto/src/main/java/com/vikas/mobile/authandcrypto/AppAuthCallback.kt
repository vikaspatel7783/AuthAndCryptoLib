package com.vikas.mobile.authandcrypto

interface AppAuthCallback {
    fun onAuthenticationSucceeded()
    fun authenticationsNotPresent()
}