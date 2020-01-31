package com.smart.kit.ui.secur

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SecurViewModel : ViewModel() {
  private val _text = MutableLiveData<String>().apply {
      value = "This is secur Fragment"
  }
    val text: LiveData<String> = _text
}
