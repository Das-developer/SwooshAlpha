package com.example.bappi.swooshalpha.ActivityController

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.bappi.swooshalpha.ModelClass.Player
import com.example.bappi.swooshalpha.R
import com.example.bappi.swooshalpha.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
 val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchleaguetxt.text = "Looking for a ${player.league} ${player.skill} league near you..."
    }

}
