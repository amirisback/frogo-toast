package com.frogobox.toasty

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.frogobox.toasty.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.apply {

            btnToast.setOnClickListener {
                Toast.makeText(this@MainActivity, "DEPRECATED", Toast.LENGTH_SHORT).show()
            }

        }


    }
}