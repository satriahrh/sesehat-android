package id.sesehat.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.sesehat.R
import androidx.recyclerview.widget.RecyclerView
import id.sesehat.model.Post
import kotlinx.android.synthetic.main.home_feed_card.view.*

class PostAdapter(val context: Context, private val objects: ArrayList<Post>) :
        RecyclerView.Adapter<PostAdapter.ViewHolder>() {

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
        val view = layoutInflater.inflate(R.layout.home_feed_card, parent, false)
        return ViewHolder(view)
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        var authorNameView = this.view.home_feed_header_author
        var authorIcView = this.view.home_feed_header_thumbnail
        var postScopeView = this.view.home_feed_header_scope
        var postBodyView = this.view.home_feed_item_body
    }
}