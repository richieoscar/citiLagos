package com.richieoscar.reechhomes.onbaording

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.richieoscar.reechhomes.adapter.PageAdapter
import com.richieoscar.reechhomes.databinding.FragmentOnboardingBinding


class Onboarding : Fragment() {

    private var _binding: FragmentOnboardingBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOnboardingBinding.inflate(layoutInflater)

        val list = arrayListOf<Fragment>(
            ScreenOne(), ScreenTwo(), ScreenThree()
        )

        var viewpager = _binding!!.viewPager
        val adapter = PageAdapter(list, requireActivity().supportFragmentManager, lifecycle)
        viewpager.adapter = adapter

        return binding.root
    }


}