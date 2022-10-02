package com.example.horizontalscroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        home.setOnClickListener {
            val fragmentTransaction=supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framelayout,HomeFragment()).commit()
        }

        prime.setOnClickListener {
            val fragmentTransaction=supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framelayout,PrimeFragment()).commit()
        }

        fashion.setOnClickListener {
            val fragmentTransaction=supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framelayout,FashionFragment()).commit()
        }

        mobiles.setOnClickListener {
            val fragmentTransaction=supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framelayout,MobileFragment()).commit()
        }

       fresh.setOnClickListener {
            val fragmentTransaction=supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.framelayout,FreshFragment()).commit()
        }
    }
}