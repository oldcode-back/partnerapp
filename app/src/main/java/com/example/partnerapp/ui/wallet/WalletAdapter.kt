package com.example.partnerapp.ui.wallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.partnerapp.R
import java.util.ArrayList

class WalletAdapter(val context: WalletFragment, var walletList : ArrayList<WalletList>) : RecyclerView.Adapter<WalletAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.billing_items, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(this.walletList[position])
    }

    override fun getItemCount(): Int {
        return walletList.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(walletList: WalletList) {
            val id = itemView.findViewById<TextView>(R.id.orderId)
            val tableNo = itemView.findViewById<TextView>(R.id.tableNo)
            val timeslot = itemView.findViewById<TextView>(R.id.timeslot)
            val date = itemView.findViewById<TextView>(R.id.date)
            val billAmount = itemView.findViewById<TextView>(R.id.billAmount)
            val percentage = itemView.findViewById<TextView>(R.id.percentage)


            id.text = walletList.orderId
            tableNo.text = walletList.tableNo
            timeslot.text = walletList.timeslot
            date.text = walletList.date
            billAmount.text = walletList.billAmount
            percentage.text = walletList.percentage



        }
    }



}



