package com.example.resylerviewhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.resylerviewhomework.adapter.CarRecyclerViewAdapter
import com.example.resylerviewhomework.databinding.ActivityMainBinding
import com.example.resylerviewhomework.model.Car

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rv.layoutManager = LinearLayoutManager(this)
        binding.rv.adapter = CarRecyclerViewAdapter(getList())
    }

    private fun getList(): List<Car> {
        val data = mutableListOf<Car>()
        (0..20).forEach { i ->
            data.add(
                Car(
                    image = getDrawable(R.drawable.car)!!,
                    name = "Car $i",
                    model = "Model $i"
                )
            )
        }
        return data
//
//        for (i in 1..10) {
//            data.add(
//                Car(
//                    image = getDrawable(R.drawable.ic_baseline_person_24)!!,
//                    name = "Car $i",
//                    model = "Model $i"
//                )
//            )
//        }
//        return data
    }
}