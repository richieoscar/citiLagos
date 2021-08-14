package com.richieoscar.reechhomes.onbaording

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.richieoscar.reechhomes.R
import com.richieoscar.reechhomes.databinding.FragmentScreenOneBinding

class ScreenOne : Fragment() {

 private var _binding : FragmentScreenOneBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentScreenOneBinding.inflate(layoutInflater)

        var viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
        _binding!!.button.setOnClickListener {
            viewPager?.currentItem = 1
        }
        return binding.root
    }

}