package com.gitsaderayanbima31.skripsiocr


import android.content.Intent
import android.os.Bundle
import android.support.v4.view.GravityCompat
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toolbar
import butterknife.BindView
import butterknife.ButterKnife
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.utils.ColorTemplate
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.activity_profil_drawer.*
import kotlinx.android.synthetic.main.app_bar_profil_activity_drawer.*
import kotlinx.android.synthetic.main.ocr_capture.*
import java.util.*


class StatistikaActivity : AppCompatActivity() {

    internal lateinit var entries: ArrayList<Entry>
    internal lateinit var PieEntryLabels: ArrayList<String>
    internal lateinit var pieDataSet: PieDataSet
    internal lateinit var pieData: PieData
    @BindView(R.id.chart1)
    internal var pieChart: PieChart? = null

    public override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)
        setContentView(R.layout.activity_statistika)

        ButterKnife.bind(this)
        entries = ArrayList()
        PieEntryLabels = ArrayList()
        AddValuesToPIEENTRY()
        AddValuesToPieEntryLabels()
        pieDataSet = PieDataSet(entries, "")
        pieData = PieData(PieEntryLabels, pieDataSet)
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS)

        pieChart = findViewById<PieChart>(R.id.chart1)
        pieChart!!.data = pieData
        pieChart!!.animateY(3000)



/*
        val toolbar_ocr = findViewById(R.id.back_ocr) as android.support.v7.widget.Toolbar
        setSupportActionBar(toolbar_ocr)
        back_ocr.setOnClickListener{

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }*/

     /*   val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        // Title and subtitle
        toolbar.setTitle(R.string.about_toolbar_title)
        toolbar.setNavigationIcon(R.drawable.ic_action_back)
        toolbar.setNavigationOnClickListener(object : View.OnClickListener() {
            fun onClick(v: View) {
                stopActivityTask()
                finish()
            }
        })*/
    }


    fun AddValuesToPIEENTRY() {

        entries.add(BarEntry(2f, 0))
        entries.add(BarEntry(4f, 1))



    }

    fun AddValuesToPieEntryLabels() {

        PieEntryLabels.add("Digital Writing")
        PieEntryLabels.add("Handwriting")


    }

}
