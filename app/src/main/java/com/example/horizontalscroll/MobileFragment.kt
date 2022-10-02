package com.example.horizontalscroll

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class MobileFragment : Fragment()
{



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View= inflater.inflate(R.layout.fragment_mobile, container, false)
        return view;
    }


}