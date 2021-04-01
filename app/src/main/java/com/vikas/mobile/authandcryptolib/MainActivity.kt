package com.vikas.mobile.authandcryptolib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.vikas.mobile.authandcrypto.AppAuthCallback
import com.vikas.mobile.authandcrypto.BiometricPromptUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BiometricPromptUtils.showUserAuthentication(this,
                object : AppAuthCallback {
                    override fun onAuthenticationSucceeded() {
                        Toast.makeText(applicationContext, "Successful user authentication", Toast.LENGTH_LONG).show()
                    }

                    override fun authenticationsNotPresent() {
                        //TODO("To be better handled")
                        Toast.makeText(applicationContext, "Authentications not provided on this device", Toast.LENGTH_LONG).show()
                    }
                })
    }
}