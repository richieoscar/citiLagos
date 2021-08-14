package com.richieoscar.reechhomes.views

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.richieoscar.reechhomes.activities.MainActivity
import com.richieoscar.reechhomes.R
import com.richieoscar.reechhomes.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {

private  var _binding:FragmentSplashBinding?= null
private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding= FragmentSplashBinding.inflate(inflater, container, false)
         Handler().postDelayed({findNavController().navigate(R.id.action_splashFragment_to_onboarding)}, 2000)

       // activity.hideNavBar()
        return binding.root
    }


}