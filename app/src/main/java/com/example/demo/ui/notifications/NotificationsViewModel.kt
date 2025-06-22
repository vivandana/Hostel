package com.example.demo.ui.notifications



import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _notifications = MutableLiveData<List<NotificationModel>>()
    val notifications: LiveData<List<NotificationModel>> = _notifications

    init {
        loadDummyNotifications()
    }

    private fun loadDummyNotifications() {
        _notifications.value = listOf(
            NotificationModel("Water Supply Cut", "Water will be unavailable from 10AM–2PM.", "20 June 2025"),
            NotificationModel("Water Supply Cut", "Water will be unavailable from 10AM–2PM.", "20 June 2025"),
            NotificationModel("Water Supply Cut", "Water will be unavailable from 10AM–2PM.", "20 June 2025"),
            NotificationModel("Water Supply Cut", "Water will be unavailable from 10AM–2PM.", "20 June 2025"),
            NotificationModel("Water Supply Cut", "Water will be unavailable from 10AM–2PM.", "20 June 2025"),
            NotificationModel("Water Supply Cut", "Water will be unavailable from 10AM–2PM.", "20 June 2025"),
            NotificationModel("New Wi-Fi Password", "Collect new Wi-Fi credentials from warden.", "19 June 2025"),
            NotificationModel("Mess Closed", "Mess will be closed this Sunday for maintenance.", "18 June 2025")
        )
    }
}
