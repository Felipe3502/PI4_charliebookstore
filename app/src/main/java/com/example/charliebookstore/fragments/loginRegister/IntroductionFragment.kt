package com.example.charliebookstore.fragments.loginRegister

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.charliebookstore.R
import com.example.charliebookstore.databinding.FragmentIntrodcutionBinding
import com.example.charliebookstore.databinding.FragmentLoginBinding
import com.example.charliebookstore.databinding.FragmentRegisterBinding

class IntroductionFragment: Fragment(R.layout.fragment_introdcution) {
    private lateinit var binding: FragmentIntrodcutionBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentIntrodcutionBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonStart.setOnClickListener {
            findNavController().navigate(R.id.action_introductionFragment_to_accountOptionsFragment)
        }
    }
}