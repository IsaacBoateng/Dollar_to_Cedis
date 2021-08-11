package com.osboat.dollartocedis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.osboat.dollartocedis.databinding.FragmentConvertBinding


class ConvertFragment : Fragment() {

    val stringInTextField = binding.dollarText.text.toString()
    /** Above, the costOfService variable is complete and can be use */
    val cost = stringInTextField.toDouble()

    private val viewModel: MyViewModel by viewModels()



    private lateinit var binding: FragmentConvertBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout XML file and return a binding object instance
        binding = FragmentConvertBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.convert.setOnClickListener { convertCurrency() }

    }

    private fun convertCurrency() {

    }

    private fun epmtyText() {
        if (binding.dollarText.text.isNotEmpty()) {
            return
        } else {
            binding.textView.text = getString(R.string.no_value_string)
        }
    }


}