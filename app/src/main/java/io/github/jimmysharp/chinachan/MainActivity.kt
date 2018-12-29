package io.github.jimmysharp.chinachan

import androidx.databinding.DataBindingUtil
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import io.github.jimmysharp.chinachan.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.main_activity)
        setSupportActionBar(binding.mainToolbar)

        val navController = findNavController(R.id.main_nav_host)
        val appBarConfiguration = AppBarConfiguration(navController.graph)
        binding.mainToolbar.setupWithNavController(navController, appBarConfiguration)
    }

}
