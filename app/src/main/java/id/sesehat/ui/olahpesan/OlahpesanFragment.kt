package id.sesehat.ui.olahpesan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import id.sesehat.R
import id.sesehat.model.Chat
import id.sesehat.model.ChatMessage
import id.sesehat.model.User
import java.util.*
import id.sesehat.adapter.ChatFeedAdapter

class OlahpesanFragment : Fragment() {

    private lateinit var olahpesanViewModel: OlahpesanViewModel
    private var chatList: ArrayList<Chat>
    init {
        this.chatList = arrayListOf()
    }

    fun loadMoreChat() {
        val user = User("Satria H R Harsono")
        val t = Date(1597589280000)
        chatList.add(
            Chat(
                "Satria H R Harsono",
                "",
                arrayOf(
                    ChatMessage(user, "Sed ut perspiciatis unde omnis iste natus", t, null)
                )
            )
        )

        chatList.add(
            Chat(
                "Satria H R Harsono",
                "",
                arrayOf(
                    ChatMessage(user, "Sed ut perspiciatis unde omnis iste natus", t, null)
                )
            )
        )

        chatList.add(
            Chat(
                "Satria H R Harsono",
                "",
                arrayOf(
                    ChatMessage(user, "Sed ut perspiciatis unde omnis iste natus", t, null)
                )
            )
        )

        chatList.add(
            Chat(
                "Satria H R Harsono",
                "",
                arrayOf(
                    ChatMessage(user, "Sed ut perspiciatis unde omnis iste natus", t, null)
                )
            )
        )

        chatList.add(
            Chat(
                "Satria H R Harsono",
                "",
                arrayOf(
                    ChatMessage(user, "Sed ut perspiciatis unde omnis iste natus", t, null)
                )
            )
        )

        chatList.add(
            Chat(
                "Satria H R Harsono",
                "",
                arrayOf(
                    ChatMessage(user, "Sed ut perspiciatis unde omnis iste natus", t, null)
                )
            )
        )

        chatList.add(
            Chat(
                "Satria H R Harsono",
                "",
                arrayOf(
                    ChatMessage(user, "Sed ut perspiciatis unde omnis iste natus", t, null)
                )
            )
        )

        chatList.add(
            Chat(
                "Satria H R Harsono",
                "",
                arrayOf(
                    ChatMessage(user, "Sed ut perspiciatis unde omnis iste natus", t, null)
                )
            )
        )

        chatList.add(
            Chat(
                "Satria H R Harsono",
                "",
                arrayOf(
                    ChatMessage(user, "Sed ut perspiciatis unde omnis iste natus", Date(1596320542000), null)
                )
            )
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        olahpesanViewModel =
            ViewModelProviders.of(this).get(OlahpesanViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_olahpesan, container, false)

        loadMoreChat()
        val layoutManager = LinearLayoutManager(context)
        val chatFeedAdapter = ChatFeedAdapter(chatList)
        val recyclerView = root.findViewById<RecyclerView>(R.id.olahpesan_feed)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = chatFeedAdapter
        return root
    }
}