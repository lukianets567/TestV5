package com.example.testv5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testv5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .replace(binding.container.id, Profile())
            .commit()
    }
    }