package io.github.jimmysharp.chinachan.ui.record

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.jimmysharp.chinachan.databinding.RecordedFragmentBinding

class RecordedFragment : Fragment() {

    companion object {
        fun newInstance() = RecordedFragment()
    }

    private lateinit var binding : RecordedFragmentBinding
    private lateinit var viewModel: RecordedViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = RecordedFragmentBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(RecordedViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
