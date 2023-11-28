package com.example.partnerapp.ui.order

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.partnerapp.ui.order.callfororder.CallforOrderFragment
import com.example.partnerapp.ui.order.dining.DiningFragment
import com.example.partnerapp.ui.order.online.OnlineFragment
import com.example.partnerapp.ui.order.takeaway.TakeAwayFragment


class OrderTabAdapter(fm: FragmentManager): FragmentStatePagerAdapter(fm){
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                OnlineFragment()
            }
            1 -> {
                DiningFragment()
            }
            2 -> {
                CallforOrderFragment()
            }
            3 -> {
                TakeAwayFragment()
            }
            else -> OnlineFragment()
        }
    }
    override fun getCount(): Int {
        return 4
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Online Order"

            1 -> "Dining"

            2 -> "Call for Order"

            3 -> "Take Away"


            else ->{
                return null
            }
        }
    }
}





