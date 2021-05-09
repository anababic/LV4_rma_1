package com.example.lv4_babic_prvizad

import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import androidx.lifecycle.ViewModelProvider
import com.example.lv4_babic_prvizad.databinding.ActivityMainBinding
import java.lang.reflect.Array.get

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = ViewModelProvider(this).get(CountersColorsViewModel::class.java)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        binding.btnBlueBird
        binding.btnGreenBird
        binding.btnRedBird
        binding.btnYellowBird
        binding.tvCounter
        setListeners()
    }

    private fun setListeners() {
        binding.btnBlueBird.setOnClickListener { view ->birdSeen(view) }
        binding.btnGreenBird.setOnClickListener {view -> birdSeen(view) }
        binding.btnRedBird.setOnClickListener {view -> birdSeen(view) }
        binding.btnYellowBird.setOnClickListener { view -> birdSeen(view) }
    }

    private fun birdSeen(view: View?) {
        binding.viewModel?.birdsCounter?.value = (binding.tvCounter.text.toString().toInt()+1).toString()

        binding.viewModel?.birdColour?.value =view!!.background as ColorDrawable


    }

    override fun onStop() {
        super.onStop()
    }

}