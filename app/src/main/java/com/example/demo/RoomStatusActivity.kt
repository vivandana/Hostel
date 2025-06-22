package com.example.demo

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RoomStatusActivity : AppCompatActivity() {

    private lateinit var tvRoomNumber: TextView
    private lateinit var tvCapacity: TextView
    private lateinit var tvRoommates: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_status)

        tvRoomNumber = findViewById(R.id.tvRoomNumber)
        tvCapacity = findViewById(R.id.tvCapacity)
        tvRoommates = findViewById(R.id.tvRoommates)

        loadRoomData()
    }

    private fun loadRoomData() {
        // Static data (simulate real student info)
        val roomNumber = "A-203"
        val capacity = 3
        val roommates = listOf("Ravi Kumar", "Anjali Sharma", "You")

        tvRoomNumber.text = "Room No: $roomNumber"
        tvCapacity.text = "Capacity: $capacity"
        tvRoommates.text = roommates.joinToString(separator = "\n")
    }
}
