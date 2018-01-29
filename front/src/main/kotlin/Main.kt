
import org.w3c.dom.HTMLDivElement
import org.w3c.xhr.TEXT
import org.w3c.xhr.XMLHttpRequest
import org.w3c.xhr.XMLHttpRequestResponseType
import kotlin.browser.document

fun main(args: Array<String>) {

    val content = document.getElementById("content") as HTMLDivElement
    val xmlHttpRequest = XMLHttpRequest()
    xmlHttpRequest.open("GET", "http://192.168.0.5:8810/api/hello")
    xmlHttpRequest.responseType = XMLHttpRequestResponseType.TEXT
    xmlHttpRequest.onload = {
        content.append(xmlHttpRequest.responseText)
    }
    xmlHttpRequest.send()
}