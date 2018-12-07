package com.asazak.burcrehberi

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var burclar = resources.getStringArray(R.array.burclar)
        var burcTarih = resources.getStringArray(R.array.burcTarih)
        var burcSembol = arrayOf(R.drawable.koc1, R.drawable.boga2, R.drawable.ikizler3, R.drawable.yengec4, R.drawable.aslan5,
                R.drawable.basak6, R.drawable.terazi7, R.drawable.akrep8, R.drawable.yay9, R.drawable.oglak10, R.drawable.kova11, R.drawable.balik12)
        //var myAdapter = BurclarArrayAdapter(this, R.layout.tek_satir, R.id.tvBurcAdi, burclar, burcTarih, burcSembol)
        //listBurclar.adapter = myAdapter
        var myBaseAdapter=BurclarBaseAdapter(this)
        listBurclar.adapter=myBaseAdapter
    }
}