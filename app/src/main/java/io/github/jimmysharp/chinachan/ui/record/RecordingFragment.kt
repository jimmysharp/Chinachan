package io.github.jimmysharp.chinachan.ui.record

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.*
import io.github.jimmysharp.chinachan.databinding.RecordingFragmentBinding

class RecordingFragment : Fragment() {

    companion object {
        fun newInstance() = RecordingFragment()
    }

    private lateinit var binding : RecordingFragmentBinding
    private lateinit var viewModel: RecordingViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = RecordingFragmentBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(RecordingViewModel::class.java)
        // TODO: Use the ViewModel
    }
}
