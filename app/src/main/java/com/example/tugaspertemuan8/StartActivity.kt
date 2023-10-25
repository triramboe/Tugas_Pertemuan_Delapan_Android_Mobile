package com.example.tugaspertemuan8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.tugaspertemuan8.databinding.ActivityStartBinding
import com.google.android.material.tabs.TabLayoutMediator

class StartActivity : AppCompatActivity() {

    lateinit var mediator : TabLayoutMediator
    lateinit var viewPager2 : ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            viewPager2 = viewPager
            viewPager.adapter = TabAdapter(supportFragmentManager
                ,this@StartActivity.lifecycle)
            mediator = TabLayoutMediator(tabLayout, viewPager){
                    tab, position ->
                when (position){
                    0-> tab.text = "Register"
                    1-> tab.text = "Login"
                }
            }
            mediator.attach()
        }
    }
}