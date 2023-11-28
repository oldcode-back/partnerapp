package com.example.partnerapp.ui.wallet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.partnerapp.R
import com.example.partnerapp.ui.feedback.FeedbackAdapter
import com.example.partnerapp.ui.feedback.FeedbackList

class WalletFragment : Fragment() {

    var adapter: WalletAdapter? = null
    var recyclerView: RecyclerView?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_wallet, container, false)

        recyclerView=root.findViewById(R.id.billingRecyclerview)
        recyclerView?.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)

        val models = ArrayList<WalletList>()
        models.add(WalletList("BM001","01","01:00 pm - 02:35 pm","15/11/2023","1,246","300"))
        models.add(WalletList("BM002","11","01:22 pm - 01:59 pm","15/11/2023","897","180"))
        models.add(WalletList("BM003","07","09:00 pm - 10:17 pm","14/11/2023","1,532","346"))
        models.add(WalletList("BM004","03","03:00 pm - 04:35 pm","14/11/2023","2,025","574"))
        models.add(WalletList("BM005","01","03:48 pm - 04:15 pm","14/11/2023","1,246","321"))
        models.add(WalletList("BM006","08","10:00 am - 10:43 am","13/11/2023","452","95"))
        models.add(WalletList("BM007","10","11:23 pm - 11:55 am","13/11/2023","694","151"))


        adapter = WalletAdapter(this, models)
        recyclerView?.adapter = adapter

        return root
    }
}