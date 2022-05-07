package com.example.dz03_02.ui.second

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.example.dz03_02.R
import com.example.dz03_02.ui.digital.DigitalActivity

class WebViewActivity : AppCompatActivity() {

     var webView:WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)



        webView = findViewById(R.id.web_view)

    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_map, menu)
        return true
    }




    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.action_fdu -> {changeWebURL("https://www.metropolitan.ac.rs/osnovne-studije/fakultet-informacionih-tehnologija/informacione-tehnologije/")}
            R.id.action_fmk -> {changeWebURL("https://www.metropolitan.ac.rs/osnovne-studije/fakultet-za-menadzment/)")}
            R.id.action_fit -> {changeWebURL("https://www.metropolitan.ac.rs/fakultet-digitalnih-umetnosti-2/")}
            R.id.action_next -> openDigitalClock()
        }

        return super.onOptionsItemSelected(item)
    }

    private fun changeWebURL(url:String){
        webView?.loadUrl(url)
    }

    private fun openDigitalClock(){
        val switchActivityIntent = Intent(this, DigitalActivity::class.java)
        startActivity(switchActivityIntent)
    }

}