package com.richieoscar.reechhomes.activities

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.richieoscar.reechhomes.R
import com.richieoscar.reechhomes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setUpBottomNavBar()

    }


   private  fun setUpBottomNavBar(){
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.frag_container) as NavHostFragment
        NavigationUI.setupWithNavController(binding.bottomNavBar, navHostFragment.navController)
    }
    
     fun hideNavBar(){
        binding.bottomNavBar.visibility =  View.GONE
    }

    fun showNavBar(){
        binding.bottomNavBar.visibility = View.VISIBLE
    }
}