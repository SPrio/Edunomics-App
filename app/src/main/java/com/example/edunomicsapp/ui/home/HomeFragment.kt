package com.example.edunomicsapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.edunomicsapp.R
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    var Skills = arrayOf(
        "Angular",
        "Bash",
        "C",
        "Electron",
        "React",
        "Android",
        "Django",
        "Rails",
        "React-Native",
        "Flutter"
    )
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val autoCompleteTextView =
            requireView().findViewById(R.id.autoCompleteTextView) as AutoCompleteTextView
        autoCompleteTextView.setAdapter<ArrayAdapter<String>>(
            ArrayAdapter<String>(
                requireContext(),
                android.R.layout.simple_dropdown_item_1line,
                Skills
            )
        )
        autoCompleteTextView.threshold = 1
    }
}