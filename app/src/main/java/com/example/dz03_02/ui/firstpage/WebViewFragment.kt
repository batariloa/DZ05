package com.example.dz03_02.ui.firstpage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import com.example.dz03_02.R
import com.example.dz03_02.model.MenuChoice



class WebViewFragment : Fragment() {

    var webView: WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        var param1: MenuChoice? = null
        super.onCreate(savedInstanceState)
        arguments?.let {

            webView = view?.findViewById(R.id.web_view)
        }


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_web_view, container, false)
    }


    companion object {
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
           WebViewFragment().apply {
                arguments = Bundle().apply {



                }
            }
    }

    fun loadUrl(url:String){
        webView?.loadUrl(url)
    }
}