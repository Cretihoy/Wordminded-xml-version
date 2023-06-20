package com.example.wordmindedxmlversion.game

import moxy.MvpView
import moxy.viewstate.strategy.SkipStrategy
import moxy.viewstate.strategy.StateStrategyType

interface GameView : MvpView {

    @StateStrategyType(SkipStrategy::class)
    fun showCards(letter: Int?, task: Int?)

    @StateStrategyType(SkipStrategy::class)
    fun showEndGameScreen()
}