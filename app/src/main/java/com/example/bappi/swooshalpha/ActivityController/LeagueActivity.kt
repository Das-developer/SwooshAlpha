package com.example.bappi.swooshalpha.ActivityController

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.bappi.swooshalpha.ModelClass.Player
import com.example.bappi.swooshalpha.R
import com.example.bappi.swooshalpha.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun MensClicked(view: View) {
        womensButton.isChecked = false
        coedButton.isChecked = false
        player.league = "Mens"

    }

    fun WomensClicked(view: View) {
        mensButton.isChecked = false
        coedButton.isChecked = false
        player.league = "Womens"

    }
    fun CoedClicked(view: View) {
        mensButton.isChecked = false
        womensButton.isChecked = false
        player.league = "Co-Ed"

    }

    fun NextButtonClicked(view: View) {

        if (player.league != "") {
            val nextbtnActivity = Intent(this,SkillActivity::class.java )
            nextbtnActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(nextbtnActivity)
        } else {
            Toast.makeText(this,"Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }
}
