package summary3

fun other(s: String): String {
  var index = 0
  var result = ""
  for (c in s) {
    if (index % 2 == 0) {
      result += c
    }
    index++
  }
  return result
}

fun main() {
  println(other("cement"))
}
/* Expected output:
cmn
*/