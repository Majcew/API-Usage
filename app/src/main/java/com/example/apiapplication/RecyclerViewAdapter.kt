package com.example.apiapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewAdapter(private val stations:MutableList<Station>, private val context: Context) : RecyclerView.Adapter<MyViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return stations.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val station = stations[position]
        holder.stationName.text = station.name
    }

}

class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
    val stationName = view.findViewById<TextView>(R.id.name)!!
}