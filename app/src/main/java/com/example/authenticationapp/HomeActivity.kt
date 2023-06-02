package com.example.authenticationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.authenticationapp.databinding.ActivityHomeBinding
import com.example.authenticationapp.databinding.ActivityRegisterBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogout.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}