package com.asazak.burcrehberi

import java.io.Serializable

/**
 * Created by SoftEngin on 8.12.2018.
 */
data class Burc(var burcAdi: String, var burTarih: String, var burcSembol: Int,var burcBuyukResim:Int,var burcGenelOzellikler:String):Serializable {}
