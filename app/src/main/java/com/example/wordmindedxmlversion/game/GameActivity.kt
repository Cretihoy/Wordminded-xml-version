package com.example.wordmindedxmlversion.game

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import com.example.wordmindedxmlversion.R
import dagger.hilt.android.AndroidEntryPoint
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter
import javax.inject.Inject
import javax.inject.Provider

@AndroidEntryPoint
class GameActivity : MvpAppCompatActivity(), GameView {

    private val taskTop: TextView by lazy { findViewById(R.id.task_top) }
    private val taskBottom: TextView by lazy { findViewById(R.id.task_bottom) }
    private val letterTop: TextView by lazy { findViewById(R.id.letter_top) }
    private val letterBottom: TextView by lazy { findViewById(R.id.letter_bottom) }
    private val gameScreen: LinearLayout by lazy { findViewById(R.id.game_screen) }

    @Inject
    lateinit var presenterProvider: Provider<GamePresenter>
    private val presenter by moxyPresenter { presenterProvider.get() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        gameScreen.setOnClickListener {
            presenter.onScreenClicked()
        }
    }

    override fun showCards(letter: Int?, task: Int?) {
        taskTop.text = task?.let { resources.getString(it) }
        taskBottom.text = task?.let { resources.getString(it) }
        letterTop.text = letter?.let { resources.getString(it) }
        letterBottom.text = letter?.let { resources.getString(it) }
    }
}