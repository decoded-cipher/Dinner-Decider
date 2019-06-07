package com.example.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Pizza", "Hamburger", "McDonalds", "Barros Pizza")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideButton.setOnClickListener{
            val random = Random
            val randomFood = random.nextInt(foodList.count())
            selectedFoodText.text = foodList[randomFood]
        }

        addFoodButton.setOnClickListener {
            val newFood = addFoodText.text.toString()
            foodList.add(newFood)
            addFoodText.text.clear()
            println(foodList)
        }
    }
}

