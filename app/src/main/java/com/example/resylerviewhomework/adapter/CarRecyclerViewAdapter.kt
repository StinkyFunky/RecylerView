package com.example.resylerviewhomework.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.resylerviewhomework.databinding.CarItemBinding
import com.example.resylerviewhomework.model.Car

class CarRecyclerViewAdapter(private val cars: List<Car>): RecyclerView.Adapter<CarRecyclerViewAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: CarItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(car: Car){
            binding.name.text = car.name
            binding.image.setImageDrawable(car.image)
            binding.model.text = car.model
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = CarItemBinding.inflate(inflater)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(cars[position])
    }

    override fun getItemCount(): Int {
        return cars.size
    }
}