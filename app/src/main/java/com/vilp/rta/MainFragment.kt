package com.vilp.rta

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_main, container, false).also {
        it.findViewById<TextView>(R.id.txt_test).text = "Olá"
        it.findViewById<Button>(R.id.btn_test).setOnClickListener { _ ->
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_menuFragment)
        }
    }

}