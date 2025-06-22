package com.example.demo

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FeesActivity : AppCompatActivity() {

    private lateinit var tvMessStatus: TextView
    private lateinit var tvRentStatus: TextView
    private lateinit var tvFineStatus: TextView
    private lateinit var tvTotalDues: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fees)

        tvMessStatus = findViewById(R.id.tvMessStatus)
        tvRentStatus = findViewById(R.id.tvRentStatus)
        tvFineStatus = findViewById(R.id.tvFineStatus)
        tvTotalDues = findViewById(R.id.tvTotalDues)

        displayFeesStatus()
    }

    private fun displayFeesStatus() {
        // Sample hardcoded values
        val messFee = 2500
        val messPaid = false

        val rentFee = 5000
        val rentPaid = true

        val fineAmount = 200
        val finePaid = false

        var totalDue = 0

        if (messPaid) {
            tvMessStatus.text = "Paid"
            tvMessStatus.setTextColor(getColor(R.color.green))
        } else {
            tvMessStatus.text = "Unpaid (₹$messFee)"
            tvMessStatus.setTextColor(getColor(R.color.red))
            totalDue += messFee
        }

        if (rentPaid) {
            tvRentStatus.text = "Paid"
            tvRentStatus.setTextColor(getColor(R.color.green))
        } else {
            tvRentStatus.text = "Unpaid (₹$rentFee)"
            tvRentStatus.setTextColor(getColor(R.color.red))
            totalDue += rentFee
        }

        if (finePaid) {
            tvFineStatus.text = "Paid"
            tvFineStatus.setTextColor(getColor(R.color.green))
        } else {
            tvFineStatus.text = "Unpaid (₹$fineAmount)"
            tvFineStatus.setTextColor(getColor(R.color.red))
            totalDue += fineAmount
        }

        tvTotalDues.text = "Total Dues: ₹$totalDue"
    }
}
