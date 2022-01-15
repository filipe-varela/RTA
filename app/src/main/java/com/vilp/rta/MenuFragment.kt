package com.vilp.rta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton

class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_menu, container, false).also {
        it.findViewById<Button>(R.id.menu_btn_new).setOnClickListener { _ ->
            Navigation.findNavController(it).navigate(R.id.action_menuFragment_to_novaEntradaFragment)
        }
        it.findViewById<Button>(R.id.menu_btn_exit).setOnClickListener {
            activity?.finishAffinity()
        }
        it.findViewById<ExtendedFloatingActionButton>(R.id.menu_efab).setOnClickListener { _ ->
            Navigation.findNavController(it).navigate(R.id.action_menuFragment_to_outrosFragment)
        }
    }

}