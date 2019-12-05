package com.kointosser.kointosser

import java.util.*

class KoinTosser {

  fun toss(): Coin {
    return Coin.fromId(Random().nextInt(Coin.values().size))
  }


}