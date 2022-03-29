package com.example.project9.ui.main

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.project9.R
import com.example.project9.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    private var _binding: MainFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.button.setOnClickListener {
            val action: MainFragmentDirections.MainToSecond = MainFragmentDirections.mainToSecond()
            action.setImage(binding.imageView.setImageDrawable(resources.getDrawable(R.drawable.android_image_1)))
            Navigation.findNavController(it).navigate(action)
        }
        binding.button2.setOnClickListener {
            val action2: MainFragmentDirections.Maintothrid = MainFragmentDirections.maintothrid()
            action2.setImage(binding.imageView2.setImageDrawable(getResources().getDrawable(R.drawable.android_image_2)))
            Navigation.findNavController(it).navigate(action2)
        }
        binding.button3.setOnClickListener {
            val action3: MainFragmentDirections.Maintoforth = MainFragmentDirections.maintoforth()
            action3.setImage(binding.imageView3.setImageDrawable(getResources().getDrawable(R.drawable.android_image_3)))
            Navigation.findNavController(it).navigate(action3)

        }

    }

    }
