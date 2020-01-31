package com.smart.kit


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class splashscreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        actionBar?.hide()

        val background = object : Thread(){
            override fun run() {
                sleep(3000)
                val intent = Intent(this@splashscreenActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

        background.start()
    }
}
