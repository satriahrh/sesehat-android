package id.sesehat.model

import java.util.*

class ChatMessage(
    val sender: User,
    val body: String,
    val sent: Date,
    val read: Date?
) {
    override fun toString(): String {
        return "chatMessage:$sender-$sent-$body"
    }
}