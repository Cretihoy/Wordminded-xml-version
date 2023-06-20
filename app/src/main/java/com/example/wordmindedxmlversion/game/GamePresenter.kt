package com.example.wordmindedxmlversion.game

import com.example.data.factory.QuestionFactory
import moxy.InjectViewState
import moxy.MvpPresenter
import javax.inject.Inject

@InjectViewState
class GamePresenter
@Inject constructor(
    private val factory: QuestionFactory
) : MvpPresenter<GameView>() {

    fun onScreenClicked() {
        if (factory.hasRemainingLetters() && factory.hasRemainingTasks()) {
            val task = factory.getRandomRegularTask()
            val letter = factory.getRandomRegularLetter()
            viewState.showCards(letter, task)
        } else {
            viewState.showEndGameScreen()
        }
    }
}