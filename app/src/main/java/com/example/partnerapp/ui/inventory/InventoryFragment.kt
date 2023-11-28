package com.example.partnerapp.ui.inventory

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.partnerapp.R
import com.example.partnerapp.ui.feedback.FeedbackAdapter
import com.example.partnerapp.ui.feedback.FeedbackList

class InventoryFragment : Fragment() {

    var adapter: InventoryAdapter? = null
    var recyclerView: RecyclerView?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_inventory, container, false)

        recyclerView=root.findViewById(R.id.inventoryRecyclerview)
        recyclerView?.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)

        val models = ArrayList<InventoryList>()
        models.add(InventoryList("Tape","Normal","11/10/2023", "180","20","160"))
        models.add(InventoryList("Stickers","Normal","22/10/2023", "150","45","105"))
        models.add(InventoryList("Box","300","22/10/2023", "180","20","160"))
        models.add(InventoryList("Box","500","22/10/2023", "180","20","160"))
        models.add(InventoryList("Box","1000","22/10/2023", "180","20","160"))
        models.add(InventoryList("Bags","Normal","08/10/2023", "200","160","40"))
        models.add(InventoryList("Chicken","Whole","25/09/2023", "200","198","2"))



        adapter = InventoryAdapter(this, models)
        recyclerView?.adapter = adapter
        return root
    }


}