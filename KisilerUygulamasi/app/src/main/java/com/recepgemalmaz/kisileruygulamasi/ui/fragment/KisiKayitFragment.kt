package com.recepgemalmaz.kisileruygulamasi.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.recepgemalmaz.kisileruygulamasi.R
import com.recepgemalmaz.kisileruygulamasi.databinding.FragmentKisiKayitBinding


class KisiKayitFragment : Fragment() {

    private lateinit var binding: FragmentKisiKayitBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentKisiKayitBinding.inflate(inflater, container, false)

        binding.buttonKaydet.setOnClickListener {
            val kisi_ad = binding.editTestKisiAd.text.toString()
            val kisi_tel = binding.editTextKisiTel.text.toString()
            kaydet(kisi_ad, kisi_tel)
        }
        return binding.root

    }


    fun kaydet(kisi_Ad : String, kisi_Tel : String){
        Log.e("Kisi Kaydet", "$kisi_Ad  -  $kisi_Tel")

    }
}