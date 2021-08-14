package com.richieoscar.reechhomes.views

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.richieoscar.reechhomes.R
import com.richieoscar.reechhomes.activities.MainActivity
import com.richieoscar.reechhomes.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

private var _binding: FragmentLoginBinding? =null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.login.setOnClickListener{
           val intent = Intent(activity, MainActivity::class.java)
            context?.startActivity(intent)
            activity?.finish()
        }
        return binding?.root
    }


}