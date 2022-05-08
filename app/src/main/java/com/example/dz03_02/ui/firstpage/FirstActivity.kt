package com.example.dz03_02.ui.firstpage

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.dz03_02.R
import com.example.dz03_02.ui.digital.DigitalActivity
import com.example.dz03_02.ui.second.WebViewActivity


class FirstActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.action_university -> openWebViewActivity()
            R.id.action_next -> openDigitalClock()
        }

        return super.onOptionsItemSelected(item)
    }


    private fun openWebViewActivity() {
        val switchActivityIntent = Intent(this, WebViewActivity::class.java)
        startActivity(switchActivityIntent)
    }

    private fun openDigitalClock(){
        val switchActivityIntent = Intent(this, DigitalActivity::class.java)
        startActivity(switchActivityIntent)
    }


}