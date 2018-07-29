package io.github.jimmysharp.chinachan.ui.top

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import io.github.jimmysharp.chinachan.R
import io.github.jimmysharp.chinachan.databinding.RecordListFragmentBinding

class RecordListFragment : Fragment() {

    companion object {
        fun newInstance() = RecordListFragment()
    }

    private lateinit var binding : RecordListFragmentBinding
    private lateinit var viewModel : RecordListViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = RecordListFragmentBinding.inflate(inflater, container, false)

        binding.button.setOnClickListener { _ ->
            findNavController().navigate(R.id.action_record_list_fragment_show_recording)
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(RecordListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
