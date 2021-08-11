package com.osboat.dollartocedis

import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {

    private var _dollarValue = 0.0
    val dollarValue: Double
        get() = _dollarValue

    private var _euroValue = 0.0
    val euroValue: Double
        get() = _euroValue


    private fun operateOn() {
        if (emptyText()) {
            _dollarValue = binding.dollarText.text.toString().toFloat().toDouble()
            _euroValue = viewModel.dollarValue * 0.85f
           // _dollarValue = binding.dollarText.text.toString().toFloat().toDouble()
           //  _euroValue = viewModel.dollarValue * 0.85f
            binding.textView.text = euroValue.toString()
        }
    }



}