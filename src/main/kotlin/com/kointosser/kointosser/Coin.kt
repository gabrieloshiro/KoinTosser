package com.kointosser.kointosser

enum class Coin {
  HEADS,
  TAILS;

  companion object {

    fun fromId(id: Int): Coin {
      return when (id) {
        0 -> HEADS
        1 -> TAILS
        else -> throw IllegalArgumentException()

      }
    }

    fun fromString(value: String): Coin {
      return when (value.toLowerCase()) {
        "h", "heads" -> HEADS
        "t", "tails" -> TAILS
        else -> throw IllegalArgumentException()

      }
    }
  }

}
