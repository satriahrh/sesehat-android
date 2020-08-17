package id.sesehat.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.sesehat.R
import androidx.recyclerview.widget.RecyclerView
import id.sesehat.model.Post
import kotlinx.android.synthetic.main.home_post_feed.view.*

class PostFeedAdapter(private val objects: ArrayList<Post>) :
        RecyclerView.Adapter<PostFeedAdapter.ViewHolder>() {

    override fun getItemCount(): Int {
        return this.objects.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.authorNameView.text = this.objects[position].author.name
        holder.authorIcView.setImageResource(this.objects[position].author.icResource)
        holder.postScopeView.text = this.objects[position].scope
        holder.postBodyView.text = this.objects[position].body
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.home_post_feed, parent, false)
        return ViewHolder(view)
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        var authorNameView = this.view.home_post_feed_author_name
        var authorIcView = this.view.home_post_feed_author_ic
        var postScopeView = this.view.home_post_feed_scope
        var postBodyView = this.view.home_post_feed_body_text
    }
}