package com.example.testv5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.testv5.databinding.FragmentCardsBinding
import java.nio.file.Files.find

class CardsFragment : Fragment() {
    private lateinit var binding: FragmentCardsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCardsBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /*binding.profileC.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction().replace(_,Profile()).commit()
        }
        binding.settingsC.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction().replace(_,Settings()).commit()

        }*/

    }
}