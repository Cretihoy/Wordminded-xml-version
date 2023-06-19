package com.example.wordmindedxmlversion.game

import android.os.Bundle
import com.example.wordmindedxmlversion.R
import dagger.hilt.android.AndroidEntryPoint
import moxy.MvpAppCompatActivity

@AndroidEntryPoint
class GameActivity : MvpAppCompatActivity(), GameView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
    }
}