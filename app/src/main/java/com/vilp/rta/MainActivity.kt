package com.vilp.rta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.google.android.material.appbar.AppBarLayout

class MainActivity : AppCompatActivity() {

    private lateinit var appBarLayout: AppBarLayout
    private lateinit var titleText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.activity_toolbar))
        supportActionBar?.setDisplayShowTitleEnabled(false)

        appBarLayout = findViewById(R.id.activity_appbar)
        titleText = findViewById(R.id.activity_toolbar_title)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView)
        if (navHostFragment != null) {
            val navController = navHostFragment.findNavController()
            val appBarConfiguration = AppBarConfiguration(navGraph = navController.graph)
            NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)
        }

        showSupportActionBar(visibility = false)

    }

    fun showSupportActionBar(visibility: Boolean, title: Int = R.string.app_name) {
        if (visibility) {
            appBarLayout.visibility = View.VISIBLE
            titleText.text = getString(title)
        } else {
            appBarLayout.visibility = View.GONE
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView)
        if (navHostFragment != null) {
            val navController = navHostFragment.findNavController()
            return navController.navigateUp() || super.onSupportNavigateUp()
        }
        return super.onSupportNavigateUp()
    }

}