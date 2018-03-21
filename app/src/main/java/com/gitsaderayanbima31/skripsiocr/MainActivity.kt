package com.gitsaderayanbima31.skripsiocr

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.GravityCompat
import android.support.v7.widget.CardView
import android.widget.Toast
import android.widget.Toolbar
import kotlinx.android.synthetic.main.activity_menu.*
import java.time.temporal.ValueRange
import com.gitsaderayanbima31.skripsiocr.R.mipmap.ic_launcher
import kotlinx.android.synthetic.main.activity_profil_drawer.*
import kotlinx.android.synthetic.main.app_bar_profil_activity_drawer.*
import kotlinx.android.synthetic.main.ocr_capture.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil_drawer)

        val btn_ocr = findViewById(R.id.button_ocr) as CardView
        button_ocr.setOnClickListener{/*
            Toast.makeText(this@MainActivity, "You Clicked OCR", Toast.LENGTH_SHORT).show()*/
            val intent = Intent(this,OcrCaptureActivity::class.java)
            startActivity(intent)
        }

        val btn_statistika = findViewById(R.id.button_statistik) as CardView
        button_statistik.setOnClickListener{

            val intent = Intent(this, StatistikaActivity::class.java)
            startActivity(intent)
        }

        val btn_kamus = findViewById(R.id.button_kamus) as CardView
        button_kamus.setOnClickListener{

            val intent = Intent(this, KamusLatinActivity::class.java)
            startActivity(intent)
        }



        val toolbar = findViewById(R.id.widget_toolbar) as android.support.v7.widget.Toolbar
        setSupportActionBar(toolbar)
        widget_toolbar.setNavigationOnClickListener{

            drawer_layout.openDrawer(GravityCompat.START)
        }


    }
}
