package com.smart.kit.ui.secur

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer

import com.smart.kit.R

class SecurFragment : Fragment() {


    private lateinit var securViewModel: SecurViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        securViewModel =
            ViewModelProviders.of(this).get(SecurViewModel::class.java)
        val root = inflater.inflate(R.layout.secur_fragment, container, false)
        val textView: TextView = root.findViewById(R.id.text_secur)
        securViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }

}
