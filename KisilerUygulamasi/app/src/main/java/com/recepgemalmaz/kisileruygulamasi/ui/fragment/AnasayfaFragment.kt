package com.recepgemalmaz.kisileruygulamasi.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.SearchView.OnQueryTextListener
import androidx.navigation.Navigation
import com.recepgemalmaz.kisileruygulamasi.R
import com.recepgemalmaz.kisileruygulamasi.data.entity.Kisiler
import com.recepgemalmaz.kisileruygulamasi.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.fab.setOnClickListener{

            Navigation.findNavController(it).navigate(R.id.kisiKayitFragment)
        }

        binding.buttonDetay.setOnClickListener{
            val kisi = Kisiler(1, "Recep", "111111")
            val gecis = AnasayfaFragmentDirections.kisiDetayGecis(kisi)
            Navigation.findNavController(it).navigate(gecis)
        }
        binding.searchView.setOnQueryTextListener(object : android.widget.SearchView.OnQueryTextListener{
            override fun onQueryTextChange(newText: String): Boolean {//Harf Girdikce ve sildikce calisir
                ara(newText)
                return true
            }

            override fun onQueryTextSubmit(query: String): Boolean {//Arama butonuna basildiginda calisir
                ara(query)
                return false
            }
        })
        return binding.root
    }

    fun ara(aramaKelimesi : String){
        Log.e("Kisi Ara", aramaKelimesi)
    }

}