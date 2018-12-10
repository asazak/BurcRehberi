package com.asazak.burcrehberi

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.io.Serializable

class MainActivity : AppCompatActivity() {

    lateinit var tumBurcBilgileri: ArrayList<Burc>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        veriKaynagiHazirla()

        var myBaseAdapter = BurclarBaseAdapter(this, tumBurcBilgileri)
        listBurclar.adapter = myBaseAdapter
        listBurclar.setOnItemClickListener { parent, view, position, id ->
            var intent=Intent(this@MainActivity,DetayActivity::class.java)
            intent.putExtra("position:",position)
            intent.putExtra("tumBurcBilgileri",tumBurcBilgileri)
            startActivity(intent)
        }
    }

    private fun veriKaynagiHazirla() {
        tumBurcBilgileri = ArrayList<Burc>(12)
        var burclar = resources.getStringArray(R.array.burclar)
        var burcTarih = resources.getStringArray(R.array.burcTarih)
        var burcSembol = arrayOf(R.drawable.koc1, R.drawable.boga2, R.drawable.ikizler3, R.drawable.yengec4,
                R.drawable.aslan5, R.drawable.basak6, R.drawable.terazi7, R.drawable.akrep8,
                R.drawable.yay9, R.drawable.oglak10, R.drawable.kova11, R.drawable.balik12)
        var buyukResimler = arrayOf(R.drawable.kocbuyuk, R.drawable.bogabuyuk, R.drawable.ikizlerbuyuk,
                R.drawable.ikizlerbuyuk, R.drawable.aslanbuyuk, R.drawable.aslanbuyuk, R.drawable.aslanbuyuk,
                R.drawable.akrepbuyuk, R.drawable.yaybuyuk, R.drawable.oglakbuyuk, R.drawable.oglakbuyuk, R.drawable.oglakbuyuk)
        var burcGenelOzellikleri = resources.getStringArray(R.array.burcGenelOzellikler)
        for (i in 0..11) {
            var arrayListeAtanacakBurc = Burc(burclar[i], burcTarih[i], burcSembol[i], buyukResimler[i], burcGenelOzellikleri[i])
            tumBurcBilgileri.add(arrayListeAtanacakBurc)
        }
    }
}
