package com.example.partnerapp.ui.feedback

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.partnerapp.R

class FeedbackFragment : Fragment() {

    var adapter: FeedbackAdapter? = null
    var recyclerView: RecyclerView?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_feedback, container, false)

        recyclerView=root.findViewById(R.id.feedbackRecyclerview)
        recyclerView?.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)

        val models = ArrayList<FeedbackList>()
        models.add(FeedbackList("Saranya","9874563210","Excellent", 4F,"10/11/2023"))
        models.add(FeedbackList("Ajith","7894561230","Delivery Delayed", 3F,"09/11/2023"))
        models.add(FeedbackList("John Andreson","8795463012","Taste Good", 5F,"09/11/2023"))
        models.add(FeedbackList("Vikram","7452301589","Late Preparing", 2.5F,"05/11/2023"))
        models.add(FeedbackList("Ishwarya","9874563210","Nice", 4F,"23/02/2022"))
        models.add(FeedbackList("Geetha","7012369854","Good Food", 4.5F,"14/02/2022"))
        models.add(FeedbackList("Ajay","8845632101","Awesome", 5F,"25/01/2022"))


        adapter = FeedbackAdapter(this, models)
        recyclerView?.adapter = adapter
        return root
    }

}