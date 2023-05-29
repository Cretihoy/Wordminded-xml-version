package com.example.wordmindedxmlversion.menuScreen

import moxy.MvpView
import moxy.viewstate.strategy.SkipStrategy
import moxy.viewstate.strategy.StateStrategyType

interface MenuScreenView : MvpView {

    @StateStrategyType(SkipStrategy::class)
    fun openGameScreen()

//    @StateStrategyType(SkipStrategy::class)
//    fun openRulesScreen()
//
//    @StateStrategyType(SkipStrategy::class)
//    fun openSettingsScreen()
}