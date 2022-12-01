package com.example.charliebookstore.fragments.shopping

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.charliebookstore.R
import com.example.charliebookstore.adapters.HomeViewpagerAdapter
import com.example.charliebookstore.databinding.FragmentHomeBinding
import com.example.charliebookstore.fragments.categories.AventuraFragment
import com.example.charliebookstore.fragments.categories.CommicHQFragment
import com.example.charliebookstore.fragments.categories.MainCategoryFragment
import com.example.charliebookstore.fragments.categories.MangaFragment
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment: Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        val categoriesFragments = arrayListOf<Fragment>(
            MainCategoryFragment(),
                AventuraFragment(),
                CommicHQFragment(),
                MangaFragment()
        )

        val viewPager2StateAdapter = HomeViewpagerAdapter(categoriesFragments, childFragmentManager, lifecycle)
        binding.viewpagerHome.adapter = viewPager2StateAdapter
        TabLayoutMediator(binding.tabLayout, binding.viewpagerHome){ tab, position ->
            when (position){
                0 -> tab.text = "Main"
                1 -> tab.text = "Aventura"
                2 -> tab.text = "CommicHQ"
                3 -> tab.text = "Manga"
            }
        }.attach()
    }

}