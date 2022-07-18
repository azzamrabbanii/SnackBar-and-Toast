package com.example.toastandsnackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.toastandsnackbar.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSnackbar.setOnClickListener {
            val snackBar = Snackbar.make(binding.root, "Appeared Successfully", Snackbar.LENGTH_INDEFINITE)
            //untuk menambahkan action
            snackBar.setAction("Retry"){
                Snackbar.make(binding.root, "Retry Clicked", Snackbar.LENGTH_SHORT).show()
            }.show()
        }

        binding.btnToast.setOnClickListener {
            Toast.makeText(this, "Toast Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}