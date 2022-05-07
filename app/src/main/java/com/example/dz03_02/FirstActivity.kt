package com.example.dz03_02

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.dz03_02.model.MenuChoice
import com.example.dz03_02.ui.firstpage.WebViewFragment


class FirstActivity : AppCompatActivity() {
    private var trenutanIzbor = MenuChoice.FDU

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
            R.id.action_next-> trenutanIzbor = MenuChoice.NEXT
            R.id.action_university -> {showWebView()
                println("BLOP")}
            R.id.action_fdu ->  changeViewFragment(MenuChoice.FDU)
            R.id.action_fit ->  changeViewFragment(MenuChoice.FIT)
            R.id.action_fmk ->  changeViewFragment(MenuChoice.FMK)
        }

        return super.onOptionsItemSelected(item)
    }

    fun next(){

    }

    fun  showWebView() {


            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentHolder, WebViewFragment.newInstance(), "fragmentHolder").commit();
            setContentView(R.layout.activity_main);


        
    }

    fun changeViewFragment(menuChoice: MenuChoice){

    }


    

}