package com.example.wordmindedxmlversion.menu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.example.wordmindedxmlversion.R
import com.example.wordmindedxmlversion.game.GameActivity
import dagger.hilt.android.AndroidEntryPoint
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter
import javax.inject.Inject
import javax.inject.Provider

@AndroidEntryPoint
class MenuActivity : MvpAppCompatActivity(), MenuView {

    val buttonStart: Button by lazy { findViewById(R.id.menu_start_button) }
    val buttonRules: Button by lazy { findViewById(R.id.menu_rules_button) }
    val buttonSettings: Button by lazy { findViewById(R.id.menu_settings_button) }

    @Inject
    lateinit var presenterProvider: Provider<MenuPresenter>
    private val presenter by moxyPresenter { presenterProvider.get() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        buttonStart.setOnClickListener { presenter.onItemCLicked() }
        buttonRules.setOnClickListener { presenter.onItemCLicked() }
        buttonSettings.setOnClickListener { presenter.onItemCLicked() }
    }

    override fun openGameScreen() {
        startActivity(Intent(this, GameActivity::class.java))
    }

//    override fun openRulesScreen() {
//        startActivity(Intent(this, RulesScreenActivity::class.java))
//    }
//
//    override fun openSettingsScreen() {
//        startActivity(Intent(this, SettingsScreenActivity::class.java))
//    }
}