package com.example.bappi.swooshalpha.ActivityController

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.bappi.swooshalpha.ModelClass.Player
import com.example.bappi.swooshalpha.R
import com.example.bappi.swooshalpha.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
  lateinit var player : Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun BeginnerButtonClicked(view: View){
        BallerButton.isChecked = false
        player.skill = "Beginner"

    }
    fun BallerButtonClicked(view: View){
        BeginnerButton.isChecked = false
        player.skill = "Baller"

    }
    fun FinishButtonClicked(view: View){
        if (player.skill != "") {

            val finishactivitie = Intent(this, FinishActivity::class.java)
            finishactivitie.putExtra(EXTRA_PLAYER,player)
            startActivity(finishactivitie)
        } else {
            Toast.makeText(this, "Please select skill level.", Toast.LENGTH_SHORT).show()
        }


    }


}
