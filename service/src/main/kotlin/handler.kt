import kotlin.js.json

@JsExport
fun handle(input: dynamic, context: dynamic, callback: (_: dynamic, response: dynamic) -> Unit): Unit {
    println(input)
    callback(null, json("statusCode" to 307, "headers" to json("location" to "https://google.com")))
}