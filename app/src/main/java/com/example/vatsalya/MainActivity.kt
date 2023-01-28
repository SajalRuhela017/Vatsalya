package com.example.vatsalya
//A GPS-enabled location tracking application designed to provide peace of mind for families by monitoring the whereabouts of loved ones in real-time. The app features include setting up geofencing and alerts for when loved ones arrive or leave specific locations, and the ability to view the location history of loved ones for a specified period of time. Additionally, the app includes an emergency SOS feature that allows users to quickly notify designated contacts in case of an emergency. With its user-friendly interface and advanced tracking capabilities, this application is the ideal solution for keeping families connected and secure.
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}