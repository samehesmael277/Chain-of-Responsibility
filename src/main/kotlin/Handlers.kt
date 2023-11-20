class Director : Handler() {
    override fun handleRequest(request: Request) {
        if (request.requestType == RequestType.CONFERENCE)
            println("Director can handle")
        else
            successor?.handleRequest(request)
    }
}

class VP : Handler() {
    override fun handleRequest(request: Request) {
        if (request.requestType == RequestType.PURCHASE) {
            if (request.amount < 1500)
                println("VP can handle")
            else
                successor?.handleRequest(request)
        }
    }
}

class CEO : Handler() {
    override fun handleRequest(request: Request) {
        println("CEO can handle")
    }
}