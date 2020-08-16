package id.sesehat.ui.olahpesan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import id.sesehat.R

class OlahpesanFragment : Fragment() {

    private lateinit var olahpesanViewModel: OlahpesanViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        olahpesanViewModel =
            ViewModelProviders.of(this).get(OlahpesanViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_olahpesan, container, false)
        val textView: TextView = root.findViewById(R.id.text_olahpesan)
        olahpesanViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}