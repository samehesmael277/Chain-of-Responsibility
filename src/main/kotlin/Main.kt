fun main(args: Array<String>) {
    val mohamed = Director()
    val ahmed = VP()
    val sameh = CEO()

    mohamed.setSuccessor(ahmed)
    ahmed.setSuccessor(sameh)

    var request = Request(RequestType.CONFERENCE, 500.0)
    mohamed.handleRequest(request)

    request = Request(RequestType.PURCHASE, 1000.0)
    mohamed.handleRequest(request)

    request = Request(RequestType.PURCHASE, 2000.0)
    mohamed.handleRequest(request)
}