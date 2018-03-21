package com.gitsaderayanbima31.skripsiocr

import android.app.Activity
import android.app.ProgressDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class KamusLatinActivity : AppCompatActivity() {

    private var progress: ProgressDialog? = null
   /* var mWebView: WebView*/


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kamus_latin)


        val mWebView = findViewById(R.id.kamus_web) as WebView
        mWebView.loadUrl("https://translate.google.co.id/?dcr=0&um=1&ie=UTF-8&hl=en&client=tw-ob#en/la/")

        // Enable Javascript
        val webSettings = mWebView.getSettings()
        webSettings.setJavaScriptEnabled(true)
        /*mWebView.getSettings().setJavaScriptEnabled(true);
        */
        webSettings.setBuiltInZoomControls(false)
        webSettings.setSupportZoom(true)
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true)
        webSettings.setAllowFileAccess(true)
        webSettings.setDomStorageEnabled(true)
        mWebView.canGoBack()
        mWebView.goBack()


        // Force links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(WebViewClient())

        progress = ProgressDialog.show(this, "Tunggu...",
                "Memproses permintaan anda.", true)
        mWebView.setWebViewClient(object : WebViewClient() {

            override fun onPageFinished(view: WebView, url: String) {
                if (progress != null)
                    progress!!.dismiss()
            }
        })
    }
/*
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    public override fun onDestroy() {
        super.onDestroy()
    }

    override fun onDetach() {
        super.onDetach()
    }*/
}
