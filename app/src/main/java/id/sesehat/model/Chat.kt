package id.sesehat.model

import java.time.Duration
import java.util.Calendar
import kotlin.time.seconds
import kotlin.time.times


class Chat(
    val topicName: String,
    val topicIcUrl: String,
    val messages: Array<ChatMessage>
) {
    override fun toString(): String {
        return "chat:$topicName-${messages[0]}"
    }

    fun recent(): String {
        val current = Calendar.getInstance().time.time
        val seconds = (current - messages[0].sent.time) / 1000
        if (seconds < 60) {
            return "$seconds s"
        }

        val minutes = seconds/60
        if (minutes < 60) {
            return "$minutes m"
        }

        val hours = minutes / 60
        if (hours < 24) {
            return "$hours h"
        }

        val days = hours / 24
        if (days < 7) {
            return "$days d"
        }

        return "${messages[0].sent.date}/${messages[0].sent.month + 1}"
    }

    fun count(): Int {
        return messages.size
    }
}