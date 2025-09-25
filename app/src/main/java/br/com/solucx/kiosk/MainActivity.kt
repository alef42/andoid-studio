
package br.com.solucx.kiosk

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.*
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    private lateinit var webView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        webView = WebView(this)
        setContentView(webView)

        with(webView.settings) {
            javaScriptEnabled = true
            domStorageEnabled = true
            loadWithOverviewMode = true
            useWideViewPort = true
        }
        webView.setOnLongClickListener { true }
        webView.isLongClickable = false

        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://survey.preview.solucx.com.br/a67535bf8b624b9e044df797fc71bbd8/buttons?name=Cliente&journey=porto_predial&store_id=alameda_barao_de_piracicaba_618_torreb&source=tablet")
    }
}
