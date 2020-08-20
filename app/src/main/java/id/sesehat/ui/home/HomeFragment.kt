package id.sesehat.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import id.sesehat.R
import id.sesehat.adapter.PostFeedAdapter
import id.sesehat.model.Post
import id.sesehat.model.User

class HomeFragment : Fragment() {
    private lateinit var homeViewModel: HomeViewModel
    private var postList: ArrayList<Post>
    init {
        this.postList = ArrayList()
    }

    fun loadMorePost() {
        postList.add(
            Post(
                User("Satria H R Harsono"),
                "Publik",
                "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo."
            )
        )

        postList.add(
            Post(
                User("Satria H R Harsono"),
                "Publik",
                "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo."
            )
        )

        postList.add(
            Post(
                User("Satria H R Harsono"),
                "Publik",
                "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo."
            )
        )

        postList.add(
            Post(
                User("Satria H R Harsono"),
                "Publik",
                "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo."
            )
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        homeViewModel.text.observe(this, Observer {
            //            textView.text = it
        })

        loadMorePost()
        val layoutManager = LinearLayoutManager(context)
        val postAdapter = PostFeedAdapter(postList)
        val recyclerView = root.findViewById<RecyclerView>(R.id.home_feed)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = postAdapter

        return root
    }
}