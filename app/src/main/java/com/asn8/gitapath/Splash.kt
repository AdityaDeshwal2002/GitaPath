package com.asn8.gitapath

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController

class Splash : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_splash, container, false)

        val loadingImage: ImageView = view.findViewById(R.id.loadingSplashScreen);
        loadingImage.setImageResource(R.drawable.splashLoading)
        Handler(Looper.getMainLooper()).postDelayed({findNavController().navigate(R.id.action_splash_to_home2)},5000)
        return view;
    }
}