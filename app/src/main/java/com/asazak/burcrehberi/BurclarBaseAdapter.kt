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
class BurclarBaseAdapter(context: Context,tumBurcBilgileri:ArrayList<Burc>) : BaseAdapter() {
    var tumBurclar: ArrayList<Burc>
    var context: Context

    init {
        this.tumBurclar = tumBurcBilgileri
        this.context = context
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var inflater = LayoutInflater.from(context)
        var tekSatirView = inflater.inflate(R.layout.tek_satir, parent, false)

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


}