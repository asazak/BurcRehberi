package com.asazak.burcrehberi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.tek_satir.view.*

/**
 * Created by SoftEngin on 5.12.2018.
 */
class BurclarBaseAdapter(context: Context) : BaseAdapter() {
    var tumBurclar: ArrayList<Burclar>
    var context: Context

    init {
        tumBurclar = ArrayList<Burclar>(12)
        this.context = context

        var burcAdlari = context.resources.getStringArray(R.array.burclar)
        var burcTarihleri = context.resources.getStringArray(R.array.burcTarih)
        var burcResimleri = arrayOf(R.drawable.koc1, R.drawable.boga2, R.drawable.ikizler3, R.drawable.yengec4, R.drawable.aslan5,
                R.drawable.basak6, R.drawable.terazi7, R.drawable.akrep8, R.drawable.yay9, R.drawable.oglak10, R.drawable.kova11, R.drawable.balik12)
        for(i in 0..11)
        {
            var arrayListeAtanacakBurc=Burclar(burcAdlari[i],burcTarihleri[i],burcResimleri[i])
            tumBurclar.add(arrayListeAtanacakBurc)
        }
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var inflater=LayoutInflater.from(context)
        var tekSatirView=inflater.inflate(R.layout.tek_satir,parent,false)

        tekSatirView.imgBurcSembol.setImageResource(tumBurclar.get(position).burcSembol)
        tekSatirView.tvBurcAdi.setText(tumBurclar.get(position).burcAdi)
        tekSatirView.tvBurcTarih.setText(tumBurclar.get(position).burTarih)

        return tekSatirView
    }

    override fun getItem(position: Int): Any {
    return tumBurclar.get(position)
    }

    override fun getItemId(position: Int): Long {
    return 0
    }

    override fun getCount(): Int {
        return tumBurclar.size
    }

    data class Burclar(var burcAdi: String, var burTarih: String, var burcSembol: Int) {

    }
}