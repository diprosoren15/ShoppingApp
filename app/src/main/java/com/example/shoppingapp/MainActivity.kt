package com.example.shoppingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomnavigation = findViewById<BottomNavigationView>(R.id.bottomnavigationview)
        replaceWithFragments(HomeFragment())

        bottomnavigation.setOnItemSelectedListener {

            when (it.itemId) {
                R.id.item3 -> replaceWithFragments(HomeFragment())
                else -> {
                    replaceWithFragments(BlankFragment())
                }
            }
            true
        }


    }

    private fun replaceWithFragments(fragment: Fragment) {
        val fragmentmanager = supportFragmentManager
        val fragmentTransaction = fragmentmanager.beginTransaction()
        fragmentTransaction.replace(R.id.framelayout, fragment).commit()
    }
}