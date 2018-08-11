package com.example.bappi.swooshalpha.ActivityController

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bappi.swooshalpha.R

class WellcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wellcome)
    }

    fun GetStartedButtonClicked(view: View) {
        val getStarted = Intent(this, LeagueActivity::class.java)
        startActivity(getStarted)
    }
}
