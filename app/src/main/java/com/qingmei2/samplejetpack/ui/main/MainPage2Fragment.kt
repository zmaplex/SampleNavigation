package com.qingmei2.samplejetpack.ui.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.qingmei2.samplejetpack.R
import kotlinx.android.synthetic.main.fragment_main_page2.*

/**
 * A simple [Fragment] subclass.
 *
 */
class MainPage2Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_page2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_page1)
        }
        btn2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_page3)
        }
    }
}