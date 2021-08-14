package com.richieoscar.reechhomes.onbaording

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.richieoscar.reechhomes.R
import com.richieoscar.reechhomes.activities.MainActivity
import com.richieoscar.reechhomes.databinding.FragmentScreenThreeBinding


class ScreenThree : Fragment() {

 private var _binding:FragmentScreenThreeBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
      _binding =  FragmentScreenThreeBinding.inflate(layoutInflater)


        _binding!!.button.setOnClickListener {
           view?.findNavController()?.navigate(R.id.action_onboarding_to_loginFragment2)
        }

        return binding.root
    }


}