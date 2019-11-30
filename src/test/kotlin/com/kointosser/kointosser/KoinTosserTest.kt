package com.kointosser.kointosser

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KoinTosserTest {

  private val koinTosser = KoinTosser()

  @Test
  fun testCoinToss() {
    for (i in 0 until 100) {
      when (val coin = koinTosser.toss()) {
        Coin.HEADS -> assertThat(coin.ordinal).isEqualTo(0)
        Coin.TAILS -> assertThat(coin.ordinal).isEqualTo(1)
        else -> throw IllegalStateException()
      }
    }
  }

}