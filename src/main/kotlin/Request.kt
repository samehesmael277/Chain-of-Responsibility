enum class RequestType {
    CONFERENCE,
    PURCHASE
}

data class Request(
    val requestType: RequestType,
    val amount: Double
)