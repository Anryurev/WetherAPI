package com.bignerdranch.android.wetherapi.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.bignerdranch.android.wetherapi.R
import com.bignerdranch.android.wetherapi.adapters.WeatherAdapter
import com.bignerdranch.android.wetherapi.adapters.WeatherModel
import com.bignerdranch.android.wetherapi.databinding.FragmentHoursBinding
import com.bignerdranch.android.wetherapi.databinding.FragmentMainBinding


class HoursFragment : Fragment() {
    private lateinit var binding: FragmentHoursBinding
    private lateinit var adapter: WeatherAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHoursBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRcView()
    }

    private fun initRcView() = with(binding){
        rcView.layoutManager = LinearLayoutManager(activity)
        adapter = WeatherAdapter()
        rcView.adapter = adapter
        val list = listOf(
            WeatherModel(
                "",
                "12:00",
                "Sunny",
                "25°C", "", "", "", ""
                ),
            WeatherModel(
                "",
                "13:00",
                "Sunny",
                "27°C",
                "", "", "", ""
            ),
            WeatherModel(
                "",
                "14:00",
                "Sunny",
                "35°C",
                "", "", "", "")
        )
        adapter.submitList(list)
    }

    companion object {
        @JvmStatic
        fun newInstance() = HoursFragment()
    }
}