package overloadingExercise1

import atomictest.eq

fun List<Int>.joinToString(
  separator: String = ", ",
  prefix: String = "",
  postfix: String = ""
): String {
  return joinTo(StringBuilder(), separator, prefix, postfix).toString()
}

fun List<Int>.myJoinToString(
  separator: String,
  prefix: String,
  postfix: String
): String {
  return joinToString(separator, prefix, postfix)
}

fun List<Int>.myJoinToString(separator: String, prefix: String): String {
  return myJoinToString(separator, prefix, "")
}

fun List<Int>.myJoinToString(separator: String): String {
  return myJoinToString(separator, "", "")
}

fun List<Int>.myJoinToString(): String {
  return myJoinToString(", ", "", "")
}

/*
fun List<Int>.myJoinToString(prefix: String, postfix: String): String {
  return TODO()
}
*/

fun main() {
  val list = listOf(1, 2, 3)
  list.myJoinToString() eq "1, 2, 3"
  list.myJoinToString(separator = "|") eq "1|2|3"
  list.myJoinToString(separator = "..", prefix = "Numbers: ") eq "Numbers: 1..2..3"
}