package io.github.jimmysharp.chinachan.ui.top

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.jimmysharp.chinachan.databinding.ReservationListFragmentBinding

class ReservationListFragment : Fragment() {

    companion object {
        fun newInstance() = ReservationListFragment()
    }

    private lateinit var binding : ReservationListFragmentBinding
    private lateinit var viewModel: ReservationListViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = ReservationListFragmentBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ReservationListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
