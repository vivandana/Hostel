package com.example.demo

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MessActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mess)

        val tvTimings = findViewById<TextView>(R.id.tvTimings)
        val tvWeeklyMenu = findViewById<TextView>(R.id.tvWeeklyMenu)

        // Set Mess Timings
        val timings = """
            • Morning Tea – 7:00 AM
            • Breakfast / Meal – 9:00 AM
            • Evening Snacks – 5:00 PM
            • Dinner – 8:00 PM
        """.trimIndent()

        tvTimings.text = timings

        // Set Weekly Food Menu
        val weeklyMenu = """
            ▪ Monday
            Morning Tea: Tea & Biscuit
            Meal: Rice, Dal, Aloo Bhaji, Curd
            Evening Snacks: Bread Pakora
            Dinner: Roti, Paneer Butter Masala, Salad

            ▪ Tuesday
            Morning Tea: Green Tea & Toast
            Meal: Pulao, Rajma, Salad
            Evening Snacks: Samosa
            Dinner: Roti, Mixed Veg, Rice, Dal

            ▪ Wednesday
            Morning Tea: Tea & Paratha
            Meal: Chole Bhature, Pickle
            Evening Snacks: Poha
            Dinner: Roti, Aloo Matar, Curd

            ▪ Thursday
            Morning Tea: Lemon Tea & Biscuits
            Meal: Rice, Moong Dal, Veg Sabzi
            Evening Snacks: Bread Roll
            Dinner: Roti, Kadhai Paneer, Sweet Dish

            ▪ Friday
            Morning Tea: Tea & Toast
            Meal: Khichdi, Curd, Papad
            Evening Snacks: Pakoda
            Dinner: Rice, Chana Masala, Roti

            ▪ Saturday
            Morning Tea: Coffee & Biscuits
            Meal: Rice, Dal Fry, Veg Pulao
            Evening Snacks: Sprouts Chaat
            Dinner: Roti, Matar Paneer, Dessert

            ▪ Sunday
            Morning Tea: Tea & Bun
            Meal: Special Veg Thali
            Evening Snacks: Noodles
            Dinner: Fried Rice, Manchurian, Ice Cream
        """.trimIndent()

        tvWeeklyMenu.text = weeklyMenu
    }
}
