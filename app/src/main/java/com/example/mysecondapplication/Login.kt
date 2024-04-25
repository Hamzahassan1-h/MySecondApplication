package com.example.mysecondapplication

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mysecondapplication.databinding.AcitvitySignUpBinding

class Login : AppCompatActivity() {
    private lateinit var binding : AcitvitySignUpBinding


    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState)

        binding = AcitvitySignUpBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)
    }
}

