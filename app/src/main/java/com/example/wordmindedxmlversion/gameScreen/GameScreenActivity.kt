package com.example.wordmindedxmlversion.gameScreen

import android.os.Bundle
import com.example.wordmindedxmlversion.R
import dagger.hilt.android.AndroidEntryPoint
import moxy.MvpAppCompatActivity

@AndroidEntryPoint
class GameScreenActivity : MvpAppCompatActivity(), GameScreenView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_screen)
    }
}