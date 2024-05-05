package com.example.tamagothicapp02

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        setOnClickListener()
    }
}

private fun setOnClickListener() {

}

class SecondActivity() : AppCompatActivity(), Parcelable {
    constructor() : this()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<SecondActivity> {
        override fun createFromParcel(parcel: Parcel): SecondActivity {
            return SecondActivity()
        }

        override fun newArray(size: Int): Array<SecondActivity?> {
            return arrayOfNulls(size)
        }
    }
}

private fun setOnClickListener() {

}

class SecondActivity : AppCompatActivity() {
    // Simulated pet status values
    private var health: Int = 100
    private var hunger: Int = 0
    private var cleanliness: Int = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Set initial pet image and status
        updatePetStatus()

        // Button click listeners
        val buttonFeed
        buttonFeed.setOnClickListener {
            // Simulate feeding action
            hunger-=20
            if (hunger < 0) hunger=0
            health+=10
            if (health > 100) health=100
            updatePetStatus()
        }

        setOnClickListener()

        setOnClickListener()
    }

    private fun updatePetStatus() {
        // Update pet image based on status
        val petImage = findViewById<ImageView>(R.id.imagePet)
        if (health > 70 && hunger < 30 && cleanliness > 70) {
            petImage.setImageResource(R.drawable.pet_happy)
        } else if (health < 30 || hunger > 70 || cleanliness < 30) {
            petImage.setImageResource(R.drawable.pet_sad)
        } else {
            petImage.setImageResource(R.drawable.pet_normal)
        }






