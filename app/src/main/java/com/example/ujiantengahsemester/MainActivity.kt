package com.example.ujiantengahsemester

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ujiantengahsemester.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonHitung.setOnClickListener {
            val panjang = binding.editTextPanjang.text.toString().toFloatOrNull()
            val lebar = binding.editTextLebar.text.toString().toFloatOrNull()
            val tinggi = binding.editTextTinggi.text.toString().toFloatOrNull()

            if (panjang != null && lebar != null && tinggi != null) {
                val luas = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi)
                val volume = panjang * lebar * tinggi
                binding.textViewHasil.text = "Luas: $luas\nVolume: $volume"
            } else {
                binding.textViewHasil.text = "Harap masukkan angka yang valid!"
            }
        }
    }
}
