package com.example.partnerapp.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.partnerapp.R

class DashboardFragment : Fragment() {

    var tableRecyclerView : RecyclerView?=null
    var tableAdapter:TableAdapter?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)

        tableRecyclerView=root.findViewById(R.id.tablesRecyclerview)
        tableRecyclerView?.layoutManager = LinearLayoutManager(activity, RecyclerView.HORIZONTAL, false)


        val tableModels = ArrayList<TablesList>()
        tableModels.add(TablesList("1","13","Rs. 4800"))
        tableModels.add(TablesList("2","5","Rs. 1250"))
        tableModels.add(TablesList("3","9","Rs. 2420"))
        tableModels.add(TablesList("4","11","Rs. 6478"))
        tableModels.add(TablesList("5","7","Rs. 1655"))
        tableModels.add(TablesList("6","3","Rs. 987"))
        tableModels.add(TablesList("7","15","Rs. 7930"))


        tableAdapter = TableAdapter(this, tableModels)
        tableRecyclerView?.adapter = tableAdapter

        return root
    }
}