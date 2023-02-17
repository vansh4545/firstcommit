package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class webactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webactivity)
        var webViewvar = findViewById<WebView>(R.id.cf)
        webViewsetup(webViewvar)
    }

    private fun  webViewsetup(a: WebView){
        a.webViewClient = WebViewClient()
        a.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true

            loadUrl("https://codeforces.com/profile/VANSH_25?mobile=true")
        }
    }
}