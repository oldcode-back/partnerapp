package com.example.partnerapp.ui.inventory

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.partnerapp.R
import java.util.ArrayList

class InventoryAdapter(val context: InventoryFragment, var inventoryLists : ArrayList<InventoryList>) : RecyclerView.Adapter<InventoryAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.inventory_items, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(this.inventoryLists[position])
    }

    override fun getItemCount(): Int {
        return inventoryLists.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(inventoryLists: InventoryList) {
            val name = itemView.findViewById<TextView>(R.id.name)
            val cat = itemView.findViewById<TextView>(R.id.category)
            val date = itemView.findViewById<TextView>(R.id.date)
            val provided = itemView.findViewById<TextView>(R.id.provided)
            val consumed = itemView.findViewById<TextView>(R.id.consumed)
            val available = itemView.findViewById<TextView>(R.id.available)


            name.text = inventoryLists.name
            cat.text = inventoryLists.cat
            date.text = inventoryLists.date
            provided.text = inventoryLists.provided
            consumed.text = inventoryLists.consumed
            available.text = inventoryLists.available



        }
    }



}



