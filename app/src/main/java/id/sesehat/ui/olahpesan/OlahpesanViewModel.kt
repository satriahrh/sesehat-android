package id.sesehat.ui.olahpesan

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OlahpesanViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is olahpesan Fragment"
    }
    val text: LiveData<String> = _text
}