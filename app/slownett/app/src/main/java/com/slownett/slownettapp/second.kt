package com.slownett.slownettapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class second : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var myWebView=findViewById<WebView>(R.id.webview)
        myWebView.webViewClient= WebViewClient()

        // Enable javascript in Webview
        myWebView.settings.javaScriptEnabled=true

        // Enter your website Url
        myWebView.loadUrl("https://www.slownett.com/")
    }
}
