package com.example.partnerapp.ui.feedback

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.partnerapp.R
import java.util.ArrayList

class FeedbackAdapter(val context: FeedbackFragment, var feedbackLists : ArrayList<FeedbackList>) : RecyclerView.Adapter<FeedbackAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.feedback_items, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(this.feedbackLists[position])
    }

    override fun getItemCount(): Int {
        return feedbackLists.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(feedbackLists: FeedbackList) {
            val name = itemView.findViewById<TextView>(R.id.txtName)
            val phone = itemView.findViewById<TextView>(R.id.txtPhone)
            val msg = itemView.findViewById<TextView>(R.id.txtDesc)
            val date = itemView.findViewById<TextView>(R.id.date)
            val rating = itemView.findViewById<RatingBar>(R.id.ratingBar)

            name.text = feedbackLists.name
            phone.text = feedbackLists.phone
            msg.text = feedbackLists.msg
            date.text = feedbackLists.date
            rating.rating = feedbackLists.rating


        }
    }



}



