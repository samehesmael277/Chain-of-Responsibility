abstract class Handler {
    internal var successor: Handler? = null

    fun setSuccessor(successor:Handler) {
        this.successor = successor
    }

    abstract fun handleRequest(request: Request)
}