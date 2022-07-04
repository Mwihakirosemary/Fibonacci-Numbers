package com.example.recyclerviewassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fibonacciNums()

        }
    fun fibonacciNums(){
        var x = 100
        var m1 = 0
        var m2 = 1
        print("First $x terms: ")

        var numberList = mutableListOf<Int>()
        for (i in 1..x){
            numberList.add(m1)

            var sum = m1 + m2
            m1 = m2
            m2 = sum

            var numberAdapter = NumberRecyclerViewAdapter(numberList)
            binding.rvNumbers.layoutManager = LinearLayoutManager(this)
            binding.rvNumbers.adapter = numberAdapter
        }

    }

}

