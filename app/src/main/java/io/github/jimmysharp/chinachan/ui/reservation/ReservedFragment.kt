package io.github.jimmysharp.chinachan.ui.reservation

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.jimmysharp.chinachan.databinding.ReservedFragmentBinding

class ReservedFragment : Fragment() {

    companion object {
        fun newInstance() = ReservedFragment()
    }

    private lateinit var binding : ReservedFragmentBinding
    private lateinit var viewModel: ReservedViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = ReservedFragmentBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ReservedViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
