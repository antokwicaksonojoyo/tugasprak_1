package com.example.datateman

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter (fragmentActivity: FragmentActivity) :
        FragmentStatePagerAdapter(fragmentActivity) {
    private val JUMLAH_MENU = 3

            override fun createFragment(position: Int): Fragment{
                when (position) {
                    0 ->{return MyFriendsFragment()}
                    1 -> {return GitHubFragment()}
                    2 -> {return ProfileFragment()}
                    else -> {return GitHubFragment()}
                }
            }

    override fun getCount(): Int {
        return JUMLAH_MENU
    }
}

