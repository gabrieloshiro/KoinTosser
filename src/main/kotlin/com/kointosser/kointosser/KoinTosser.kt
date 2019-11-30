package com.kointosser.kointosser

import org.springframework.stereotype.Component
import java.util.*

@Component
class KoinTosser {

  fun toss(): Coin {
    return Coin.fromId(Random().nextInt(Coin.values().size))
  }


}