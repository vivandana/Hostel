package com.example.demo.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.ViewFlipper
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.demo.R

class HomeFragment : Fragment() {

    private val homeViewModel: HomeViewModel by viewModels()
    private lateinit var viewFlipper: ViewFlipper
    private lateinit var tvAbout: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        viewFlipper = view.findViewById(R.id.viewFlipper)
        tvAbout = view.findViewById(R.id.tvAbout)

        setupImageSlider()
        setupAboutText()

        return view
    }

    private fun setupImageSlider() {
        val images = intArrayOf(
            R.drawable.hostel1,
            R.drawable.mess1,
            R.drawable.room1
        )

        for (image in images) {
            val imageView = ImageView(requireContext())
            imageView.setImageResource(image)
            imageView.scaleType = ImageView.ScaleType.CENTER_CROP
            viewFlipper.addView(imageView)
        }

        viewFlipper.flipInterval = 3000
        viewFlipper.isAutoStart = true
        viewFlipper.startFlipping()
    }

    private fun setupAboutText() {
        homeViewModel.aboutText.observe(viewLifecycleOwner) { text ->
            tvAbout.text = text
        }
    }
}
