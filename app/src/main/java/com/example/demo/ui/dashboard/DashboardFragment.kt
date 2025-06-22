package com.example.demo.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.demo.CoursesActivity
import com.example.demo.HostelActivity
import com.example.demo.MessActivity
import com.example.demo.ProfileActivity
import com.example.demo.R
import com.example.demo.RulesActivity
import com.example.demo.databinding.FragmentDashboardBinding
import com.example.demo.databinding.FragmentHomeBinding

class DashboardFragment : Fragment() {

//    private var _binding: FragmentDashboardBinding? = null
//
//    // This property is only valid between onCreateView and
//    // onDestroyView.
//    private val binding get() = _binding!!
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        val dashboardViewModel =
//            ViewModelProvider(this).get(DashboardViewModel::class.java)
//
//        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
//        val root: View = binding.root
//
//        val textView: TextView = binding.textDashboard
//        dashboardViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
//        return root
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }


//
//    private var _binding: FragmentDashboardBinding? = null
//    private val binding get() = _binding!!
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
//        val root: View = binding.root
//
//        // Set onClickListeners for each card
//        binding.btnRegister.setOnClickListener {
//            Toast.makeText(requireContext(), "Student Registered", Toast.LENGTH_SHORT).show()
////            startActivity(Intent(requireContext(), CoursesActivity::class.java))
//        }
//        return root
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
//}



//    val cardCourses = findViewById<CardView>(R.id.cardCourses)
//    val cardHostel = findViewById<CardView>(R.id.cardHostel)
//
//    cardCourses.setOnClickListener {
//        val intent = Intent(this, CoursesActivity::class.java)
//        startActivity(intent)
//    }
//
//    cardHostel.setOnClickListener {
//        val intent = Intent(this, HostelActivity::class.java)
//        startActivity(intent)
//    }


    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Set onClickListeners for each card
        binding.cardProfile.setOnClickListener {
//            Toast.makeText(requireContext(), "Profile Clicked", Toast.LENGTH_SHORT).show()
            startActivity(Intent(requireContext(), ProfileActivity::class.java))
        }

        // Set onClickListeners for each card
        binding.cardCourses.setOnClickListener {
//            Toast.makeText(requireContext(), "Courses Clicked", Toast.LENGTH_SHORT).show()
            startActivity(Intent(requireContext(), CoursesActivity::class.java))
        }

        binding.cardHostel.setOnClickListener {
//            Toast.makeText(requireContext(), "Hostel Clicked", Toast.LENGTH_SHORT).show()
            startActivity(Intent(requireContext(), HostelActivity::class.java))
        }

        binding.cardMess.setOnClickListener {
//            Toast.makeText(requireContext(), "Mess Clicked", Toast.LENGTH_SHORT).show()
            startActivity(Intent(requireContext(), MessActivity::class.java))
        }

        binding.cardRules.setOnClickListener {
//            Toast.makeText(requireContext(), "Rules Clicked", Toast.LENGTH_SHORT).show()
             startActivity(Intent(requireContext(), RulesActivity::class.java))
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
