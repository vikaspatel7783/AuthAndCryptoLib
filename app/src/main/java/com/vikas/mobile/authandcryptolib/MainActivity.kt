package com.vikas.mobile.authandcryptolib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.vikas.mobile.authandcrypto.AppAuthCallback
import com.vikas.mobile.authandcrypto.BiometricPromptUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_device_secure).setOnClickListener {
            val isDeviceSecured = BiometricPromptUtils.isDeviceSecured(this)
            Toast.makeText(this, "Device secured: $isDeviceSecured", Toast.LENGTH_LONG).show()
        }


//        BiometricPromptUtils.showUserAuthentication(this,
//            object : AppAuthCallback {
//                override fun onAuthenticationSucceeded() {
//                    Toast.makeText(applicationContext, "Successful user authentication", Toast.LENGTH_LONG).show()
//                }
//
//                override fun authenticationsNotPresent() {
//                    //TODO("To be better handled")
//                    Toast.makeText(applicationContext, "Authentications not provided on this device", Toast.LENGTH_LONG).show()
//                }
//
//                override fun onUserCancels() {
//                    finish()
//                }
//
//            })
    }
}