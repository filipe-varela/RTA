package com.vilp.rta

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_main, container, false).also {
        (activity as MainActivity).showSupportActionBar(visibility = false)
        it.findViewById<LinearLayout>(R.id.main_parent).setOnClickListener { _ ->
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_menuFragment)
        }
        it.findViewById<ExtendedFloatingActionButton>(R.id.main_efab).setOnClickListener { _ ->
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_guiaFragment)
        }
    }

}