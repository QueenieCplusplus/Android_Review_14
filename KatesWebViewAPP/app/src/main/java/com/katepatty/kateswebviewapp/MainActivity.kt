package com.katepatty.kateswebviewapp

import android.os.Bundle
import android.webkit.WebView
//import android.webkit.WebSettings
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity





class MainActivity : AppCompatActivity() {

    val kwebview = findViewById(R.id.wv) as WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onSet()
        onLoad()

    }

    private fun onSet(){

        val webSettings = kwebview.settings
        webSettings.javaScriptEnabled = true

    }

    private fun onLoad(){

        setContentView(kwebview)
        //kwebview.webViewClient = WebViewClient()
        kwebview.loadUrl("https://www.cwb.gov.tw/V8/C/W/OBS_UVI.html")

    }


}
