package com.example.demo

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class HostelActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hostel)

        val etName = findViewById<EditText>(R.id.etName)
        val etRoomNo = findViewById<EditText>(R.id.etRoomNo)
        val etPhone = findViewById<EditText>(R.id.etPhone)
        val spinnerType = findViewById<Spinner>(R.id.spinnerType)
        val etComplaint = findViewById<EditText>(R.id.etComplaint)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)

        // Spinner setup
        val options = arrayOf("Hostel", "Mess", "Other")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, options)
        spinnerType.adapter = adapter

        btnSubmit.setOnClickListener {
            val name = etName.text.toString().trim()
            val roomNo = etRoomNo.text.toString().trim()
            val phone = etPhone.text.toString().trim()
            val type = spinnerType.selectedItem.toString()
            val complaintText = etComplaint.text.toString().trim()

            // Validation
            if (name.isEmpty() || roomNo.isEmpty() || phone.isEmpty() || complaintText.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else {
                // ✅ Show confirmation dialog
                val message = """
                    Complaint Submitted:
                    
                    Name: $name
                    Room No: $roomNo
                    Phone: $phone
                    Type: $type
                    Complaint: $complaintText
                """.trimIndent()

                AlertDialog.Builder(this)
                    .setTitle("Thank You!")
                    .setMessage(message)
                    .setPositiveButton("OK") { dialog, _ ->
                        dialog.dismiss()
                        // Clear fields
                        etName.text.clear()
                        etRoomNo.text.clear()
                        etPhone.text.clear()
                        etComplaint.text.clear()
                        spinnerType.setSelection(0)
                    }
                    .setCancelable(false)
                    .show()
            }
        }
    }
}
