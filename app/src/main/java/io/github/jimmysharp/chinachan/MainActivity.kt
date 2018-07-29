package io.github.jimmysharp.chinachan

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import io.github.jimmysharp.chinachan.databinding.MainActivityBinding
import io.github.jimmysharp.chinachan.ui.top.ProgramListFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding : MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.main_activity)
        setSupportActionBar(binding.mainToolbar)

        val navController = findNavController(R.id.main_nav_host)
        NavigationUI.setupWithNavController(binding.mainToolbar, navController)
    }

}
