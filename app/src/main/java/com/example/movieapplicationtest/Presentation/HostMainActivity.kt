package com.example.movieapplicationtest.Presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.movieapplicationtest.Common.ActivityDesign
import com.example.movieapplicationtest.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HostMainActivity : AppCompatActivity() {
    @Inject
    lateinit var activityDesign: ActivityDesign
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_characters_screen)
        activityDesign.excuteDesign(this)
        contentview()
    }
    fun contentview(){

    }
}