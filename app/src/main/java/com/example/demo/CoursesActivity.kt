package com.example.demo

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.DatePicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.demo.databinding.FragmentDashboardBinding
import com.google.android.material.textfield.TextInputEditText
import java.text.SimpleDateFormat
import java.util.*

class CoursesActivity : AppCompatActivity() {

    private lateinit var etDOB: TextInputEditText
    private val calendar = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)


        // Inside your Activity's onCreate method
        val registerButton = findViewById<Button>(R.id.btnRegister)

        registerButton.setOnClickListener {
            Toast.makeText(this, "Registered Successfully", Toast.LENGTH_SHORT).show()
        }


        etDOB = findViewById(R.id.etDOB)

        etDOB.setOnClickListener {
            showDatePickerDialog()
        }
    }

    private fun showDatePickerDialog() {
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(this, { _: DatePicker, y: Int, m: Int, d: Int ->
            calendar.set(Calendar.YEAR, y)
            calendar.set(Calendar.MONTH, m)
            calendar.set(Calendar.DAY_OF_MONTH, d)

            val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
            etDOB.setText(dateFormat.format(calendar.time))
        }, year, month, day)

        datePickerDialog.show()
    }




}
