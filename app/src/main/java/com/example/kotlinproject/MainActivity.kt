package com.example.kotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinproject.databinding.ActivityMainBinding
import kotlin.math.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calcSummaButton.setOnClickListener {
            val number1 = binding.number1EditText.text.toString().toDouble()
            val number2 = binding.number2EditText.text.toString().toDouble()

            val result = number1+number2

            binding.sumResultText.text = result.toString()

        }

        binding.calcMinusButton.setOnClickListener {
            val number1 = binding.number1EditText.text.toString().toDouble()
            val number2 = binding.number2EditText.text.toString().toDouble()

            val result = number1-number2

            binding.sumResultText.text = result.toString()

        }

        binding.calcSeparateButton.setOnClickListener {
            val number1 = binding.number1EditText.text.toString().toDouble()
            val number2 = binding.number2EditText.text.toString().toDouble()

            val result: Double = number1 / number2

            binding.sumResultText.text = result.toString()

        }

        binding.calcMnogButton.setOnClickListener {
            val number1 = binding.number1EditText.text.toString().toDouble()
            val number2 = binding.number2EditText.text.toString().toDouble()

            val result = number1*number2

            binding.sumResultText.text = result.toString()

        }

        binding.calcSqrtButton.setOnClickListener {
            val number1 = binding.number1EditText.text.toString().toDouble()

            val result = sqrt(number1.toDouble())

            binding.sumResultText.text = result.toString()

        }

        binding.calcXpowButton.setOnClickListener {
            val number1 = binding.number1EditText.text.toString().toDouble()

            val result = number1*number1

            binding.sumResultText.text = result.toString()

        }

        binding.calcSinusButton.setOnClickListener {
            val number1 = binding.number1EditText.text.toString().toDouble()


            val result: Double = sin((number1 * PI /180))

            binding.sumResultText.text = result.toString()

        }

        binding.calcCosinusButton.setOnClickListener {
            val number1 = binding.number1EditText.text.toString().toDouble()


            val result = cos((number1 * PI /180))

            binding.sumResultText.text = result.toString()

        }

        binding.calcTangensButton.setOnClickListener {
            val number1 = binding.number1EditText.text.toString().toDouble()


            val result = tan((number1 * PI /180))

            binding.sumResultText.text = result.toString()

        }

        binding.calcCotanButton.setOnClickListener {
            val number1 = binding.number1EditText.text.toString().toDouble()


            val result = 1/tan((number1 * PI /180))

            binding.sumResultText.text = result.toString()

        }

        binding.calcInchButton.setOnClickListener {
            val number1 = binding.number1EditText.text.toString().toDouble()


            val result = number1 * 2.54
            binding.sumResultText.text = result.toString()

        }

        binding.calcCmButton.setOnClickListener {
            val number1 = binding.number1EditText.text.toString().toDouble()


            val result = number1 /2.54

            binding.sumResultText.text = result.toString()

        }

    }

}
