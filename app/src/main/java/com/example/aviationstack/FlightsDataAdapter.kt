package com.example.aviationstack

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class FlightsDataAdapter(val items:ArrayList<String>): RecyclerView.Adapter<FlightsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlightsViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_views,parent,false)
        return FlightsViewHolder(view)


    }

    override fun onBindViewHolder(holder: FlightsViewHolder, position: Int) {
       val currentItem=items[position]
        holder.flights.text=currentItem

    }

    override fun getItemCount(): Int {
        return items.size

    }
}
class FlightsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    val flights:TextView=itemView.findViewById(R.id.flights)

}