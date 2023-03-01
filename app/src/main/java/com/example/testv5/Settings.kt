package com.example.testv5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testv5.databinding.FragmentSettingsBinding

class Settings : Fragment() {
    private lateinit var binding: FragmentSettingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSettingsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setDisabled()

        binding.switch1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) setEnabled()
            else setDisabled()
        }
    }

    private fun setEnabled() {
        binding.ii1.isEnabled = true
        binding.ii2.isEnabled = true
        binding.ii3.isEnabled = true
    }

    private fun setDisabled() {
        binding.ii1.isEnabled = false
        binding.ii2.isEnabled = false
        binding.ii3.isEnabled = false
    }
}