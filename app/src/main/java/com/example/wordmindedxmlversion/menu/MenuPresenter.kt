package com.example.wordmindedxmlversion.menu

import moxy.InjectViewState
import moxy.MvpPresenter
import javax.inject.Inject

@InjectViewState
class MenuPresenter
@Inject constructor() : MvpPresenter<MenuView>() {

    fun onItemCLicked() {
        viewState.openGameScreen()
        viewState.openRulesScreen()
//        viewState.openSettingsScreen()
    }
}