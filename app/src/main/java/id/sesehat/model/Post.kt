package id.sesehat.model

class Post(
    val author: User,
    val scope: String,
    val body: String
) {
    override fun toString(): String {
        return author.name + "-" + scope + "-" + body.subSequence(0, 5) + "..."
    }
}