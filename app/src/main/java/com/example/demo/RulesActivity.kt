package com.example.demo

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RulesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rules)

        val tvHostelRules = findViewById<TextView>(R.id.tvHostelRules)
        val tvMessRules = findViewById<TextView>(R.id.tvMessRules)

        val hostelRules = """
            1. Students must return to the hostel by 9:00 PM.
            2. Loud music and parties are strictly prohibited.
            3. No outsider is allowed in the rooms without prior permission.
            4. Rooms must be kept clean and tidy.
            5. Ragging is strictly prohibited and is a punishable offense.
            6. Electrical appliances other than those provided are not allowed.
        """.trimIndent()

        val messRules = """
            1. Meal timings must be strictly followed.
            2. Wastage of food is discouraged.
            3. Students must carry their ID card to the mess.
            4. No food should be taken out of the mess area.
            5. Maintain cleanliness and hygiene in the dining area.
            6. Complaints about food should be submitted via the complaint form.
        """.trimIndent()

        tvHostelRules.text = hostelRules
        tvMessRules.text = messRules
    }
}
