package com.example.wordmindedxmlversion.menuScreen

import moxy.InjectViewState
import moxy.MvpPresenter
import javax.inject.Inject

@InjectViewState
class MenuScreenPresenter
@Inject constructor() : MvpPresenter<MenuScreenView>() {

    fun onItemCLicked() {
        viewState.openGameScreen()
//        viewState.openRulesScreen()
//        viewState.openSettingsScreen()
    }
}