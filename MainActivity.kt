package com.example.tools

import android.content.Context
import android.os.Bundle
import android.util.Base64
import android.webkit.JavascriptInterface
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

val encodedHtml = """
<button onclick="Android.callAndroid('你好 Android')">call Android</button>
""".trimIndent()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView.settings.javaScriptEnabled = true
        webView.addJavascriptInterface(WebAppInterface(this), "Android")
        webView.loadData(
            Base64.encodeToString(encodedHtml.toByteArray(), Base64.NO_PADDING),
            "text/html", "base64"
        )
    }
}

// JavascriptInterface class
class WebAppInterface(private val mContext: Context) {

    @JavascriptInterface
    fun callAndroid(toast: String) {
        Toast.makeText(mContext, "call: $toast", Toast.LENGTH_SHORT).show()
    }
}
