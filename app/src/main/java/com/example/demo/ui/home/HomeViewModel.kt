package com.example.demo.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _aboutText = MutableLiveData<String>().apply {
        value = """
            Welcome to Hostel Management App!

            This app provides all hostel and mess-related services in one place:
            • View hostel rules and mess timings
            • Submit complaints and track issues
            • Check food menu and room details
            • Admin panel for staff to manage students

            Designed to simplify communication between students and hostel administration.
        """.trimIndent()
    }
    val aboutText: LiveData<String> = _aboutText
}
