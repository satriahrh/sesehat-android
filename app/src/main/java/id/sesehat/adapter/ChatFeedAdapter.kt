package id.sesehat.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.sesehat.R
import id.sesehat.model.Chat
import kotlinx.android.synthetic.main.olahpesan_feed_card.view.*

class ChatFeedAdapter(private val objects: ArrayList<Chat>) :
        RecyclerView.Adapter<ChatFeedAdapter.ViewHolder>() {

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val topicIc = view.olahpesan_feed_card_topic_ic
        val topicName = view.olahpesan_feed_card_topic_name
        val summary = view.olahpesan_feed_card_summary
        val recent = view.olahpesan_feed_card_recent
        val count = view.olahpesan_feed_card_count
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatFeedAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.olahpesan_feed_card, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChatFeedAdapter.ViewHolder, position: Int) {
        holder.topicIc.setImageResource(R.drawable.ic_account_circle_black_48dp)
        holder.topicName.text = objects[position].topicName
        holder.summary.text = objects[position].messages[0].body
        holder.recent.text = objects[position].recent()
        holder.count.text = objects[0].count().toString()
        if (objects[0].count() == 0) {
            holder.count.elevation = (-1).toFloat()
        }
    }

    override fun getItemCount(): Int {
        return this.objects.count()
    }
}