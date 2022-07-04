package com.example.recyclerviewassignment

import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumberRecyclerViewAdapter(var numberList: MutableList<Int>):
RecyclerView.Adapter<NumberViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.number_list_item,parent,false)
        return NumberViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.tvNumbers
    }

    override fun getItemCount(): Int {
        return numberList.size
    }
}
class NumberViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvNumbers = itemView.findViewById<EditText>(R.id.tvNumbers)
}