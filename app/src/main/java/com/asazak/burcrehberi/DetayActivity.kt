package com.asazak.burcrehberi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detay.*

class DetayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detay)
        var position=intent.extras.get("position:") as Int
        var tumBurcBilgileri=intent.extras.get("tumBurcBilgileri") as Array<Burc>
        tvBurcOzellikleri.setText(tumBurcBilgileri.get(position).burcGenelOzellikler)
        Toast.makeText(this,"Tıklanılan:  "+position+"Tüm Burç Sayısı"+ tumBurcBilgileri.size,Toast.LENGTH_SHORT).show()
    }
}
