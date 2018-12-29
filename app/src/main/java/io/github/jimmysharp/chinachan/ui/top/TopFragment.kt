package io.github.jimmysharp.chinachan.ui.top

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.*
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import io.github.jimmysharp.chinachan.R

import io.github.jimmysharp.chinachan.databinding.TopFragmentBinding

class TopFragment : Fragment() {

    companion object {
        fun newInstance() = TopFragment()
    }

    private lateinit var binding: TopFragmentBinding
    private lateinit var viewModel: TopViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = TopFragmentBinding.inflate(inflater, container, false)

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(TopViewModel::class.java)

        val navController = (childFragmentManager.findFragmentById(R.id.top_nav_host) as NavHostFragment).navController
        binding.topBottomNavigation.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater!!.inflate(R.menu.top_toolbar, menu)

        val settingItem = menu!!.findItem(R.id.setting_fragment)
        settingItem.setOnMenuItemClickListener{ _ ->
            findNavController().navigate(R.id.action_top_fragment_show_setting)
            true
        }
    }

}
