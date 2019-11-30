package com.kointosser.kointosser

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class CoinTest {

  @Test
  fun testFromId() {
    assertThat(Coin.fromId(0)).isEqualTo(Coin.HEADS)
    assertThat(Coin.fromId(1)).isEqualTo(Coin.TAILS)
  }

  @Test
  fun testFromString() {
    assertThat(Coin.fromString("t")).isEqualTo(Coin.TAILS)
    assertThat(Coin.fromString("T")).isEqualTo(Coin.TAILS)
    assertThat(Coin.fromString("tails")).isEqualTo(Coin.TAILS)
    assertThat(Coin.fromString("TAILS")).isEqualTo(Coin.TAILS)

    assertThat(Coin.fromString("h")).isEqualTo(Coin.HEADS)
    assertThat(Coin.fromString("H")).isEqualTo(Coin.HEADS)
    assertThat(Coin.fromString("heads")).isEqualTo(Coin.HEADS)
    assertThat(Coin.fromString("HEADS")).isEqualTo(Coin.HEADS)
  }

  @Test
  fun testInvalidFromId() {
    assertThrows<IllegalArgumentException> { Coin.fromId(9819) }
  }

  @Test
  fun testInvalidFromString() {
    assertThrows<IllegalArgumentException> { Coin.fromString("INVALID") }
  }


}