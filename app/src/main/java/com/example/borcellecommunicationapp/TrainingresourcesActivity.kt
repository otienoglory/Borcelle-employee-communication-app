package com.example.borcellecommunicationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView


class TrainingresourcesActivity : AppCompatActivity() {
    lateinit var web:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trainingresources)
        web=findViewById(R.id.mywebView)

        val webSettings  = web.settings
        webSettings.javaScriptEnabled = true
        web.loadUrl("https://www.indeed.com")

    }

}
