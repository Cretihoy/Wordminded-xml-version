package com.example.wordmindedxmlversion.settings

import android.os.Bundle
import android.widget.Switch
import com.example.wordmindedxmlversion.R
import dagger.hilt.android.AndroidEntryPoint
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter
import javax.inject.Inject
import javax.inject.Provider

@AndroidEntryPoint
class SettingsActivity : MvpAppCompatActivity(), SettingsView {

    val switchInfinityGame: Switch by lazy { findViewById(R.id.settings_switch_infinity_game) }

    @Inject
    lateinit var presenterProvider: Provider<SettingsPresenter>
    private val presenter by moxyPresenter { presenterProvider.get() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
    }
}