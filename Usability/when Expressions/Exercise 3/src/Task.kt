package whenExpressionsExercise3

import atomictest.eq

fun isBalanced(input: String): Boolean {
  var leftUnmatched = 0
  for (c in input) {
    when (c) {
      '(' -> leftUnmatched++
      ')' -> leftUnmatched--
      ' ' -> {
      }
      else -> throw IllegalArgumentException("The string must consist " +
        "only of parentheses and whitespaces")
    }
    if (leftUnmatched < 0) return false
  }
  return leftUnmatched == 0
}

fun main() {
  isBalanced("(()) ()") eq true
  isBalanced(")(") eq false
}