package com.example.partnerapp.ui.dashboard

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView
import com.example.partnerapp.R
import java.util.*

class TableAdapter(val context: DashboardFragment, var tablesList: ArrayList<TablesList>) : RecyclerView.Adapter<TableAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.table_items,
            parent,
            false
        )

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(this.tablesList[position], context)
    }

    override fun getItemCount(): Int {
        return tablesList.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val no: TextView = itemView.findViewById(R.id.txtTableno)
        val orders: TextView = itemView.findViewById(R.id.tableOrders)
        val amount: TextView = itemView.findViewById(R.id.tableAmount)


        fun bindItems(tablesList: TablesList, context: DashboardFragment) {
           no.text = tablesList.tableNo
            orders.text = tablesList.tableOrder
            amount.text = tablesList.tableAmount
        }
    }


}


