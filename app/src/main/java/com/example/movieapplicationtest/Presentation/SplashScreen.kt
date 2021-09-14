package com.example.movieapplicationtest.Presentation

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.movieapplicationtest.Common.ActivityDesign
import com.example.movieapplicationtest.Common.BlurTransformation
import com.example.movieapplicationtest.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@AndroidEntryPoint
class SplashScreen : AppCompatActivity() {
    @Inject
    lateinit var activitydesign:ActivityDesign
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activitydesign.excuteDesign(this)
        Glide.with(this)
            .load(R.drawable.mcu_background)
            .apply(RequestOptions.bitmapTransform(BlurTransformation(this)))
            .into(findViewById(R.id.background))
        lanch_next_screen()

    }
    fun lanch_next_screen() {
        val intent = Intent(this, CharactersScreen::class.java)
        GlobalScope.launch {
            runBlocking {
                delay(3000)
                startActivity(intent)
                finish()
            }
        }
    }
}
