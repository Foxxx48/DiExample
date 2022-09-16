package com.fox.diexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fox.diexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val activity = Activity()
        binding.tv1.text = activity.computer.mouse.toString()
        binding.tv2.text = activity.computer.keyboard.toString()
        binding.tv3.text = activity.computer.monitor.toString()
        binding.tv4.text = activity.computer.computerTower.toString()
        binding.tv5.text = activity.computer.computerTower.memory.toString()
        binding.tv6.text = activity.computer.computerTower.storage.toString()
        binding.tv7.text = activity.computer.computerTower.processor.toString()
        binding.tv8.text = "ComputerTower"

    }
}