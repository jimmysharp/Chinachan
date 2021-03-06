package io.github.jimmysharp.chinachan.ui.top

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
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

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(RecordListViewModel::class.java)
        // TODO: Use the ViewModel

        binding.button.setOnClickListener { _ ->
            activity!!.findNavController(R.id.main_nav_host).navigate(R.id.action_top_fragment_show_recording)
        }
    }

}
