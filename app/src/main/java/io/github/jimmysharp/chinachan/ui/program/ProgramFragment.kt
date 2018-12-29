package io.github.jimmysharp.chinachan.ui.program

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.jimmysharp.chinachan.databinding.ProgramFragmentBinding

class ProgramFragment : Fragment() {

    companion object {
        fun newInstance() = ProgramFragment()
    }

    private lateinit var binding : ProgramFragmentBinding
    private lateinit var viewModel: ProgramViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = ProgramFragmentBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ProgramViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
