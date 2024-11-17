package com.example.futboltakmlistesi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.futboltakmlistesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var bedirhan = Oyuncu(R.drawable.bedirhancetin, "Bedirhan Çetin", "19", "Defender", "96", "1", "0")
        var carlo = Oyuncu(R.drawable.carloholse, "Carlo Holse", "25", "Forward", "21", "45", "10")
        var ercan = Oyuncu(R.drawable.ercan, "Ercan Kara", "28", "Forward", "29", "28", "4")
        var flavien = Oyuncu(R.drawable.flavientait, "Flavien Tait", "31", "Midfielder", "13", "34", "1")
        var haluk = Oyuncu(R.drawable.haluk, "Haluk Mustafa Tan", "19", "Defender", "72", "13", "0")
        var landry = Oyuncu(R.drawable.landry, "Landry Dimata", "27", "Forward", "14", "33", "4")
        var marcbola = Oyuncu(R.drawable.marcbola, "Marc Bola", "26", "Defender", "16", "35", "0")
        var okankocuk = Oyuncu(R.drawable.okankocuk, "Okan Kocuk", "29", "Goalkeeper", "1", "48", "0")
        var olivier = Oyuncu(R.drawable.olivierntcham, "Olivier Tcham", "28", "Midfielder", "10", "39", "11")
        var yunus = Oyuncu(R.drawable.yunus, "Yunus Emre Çift", "21", "Defender", "22", "44", "1")
        var zeki = Oyuncu(R.drawable.zekiyavru, "Zeki Yavru", "33", "Defender", "18", "72", "3")

        var kadro = ArrayList<Oyuncu>()
        kadro.add(bedirhan)
        kadro.add(carlo)
        kadro.add(ercan)
        kadro.add(flavien)
        kadro.add(haluk)
        kadro.add(landry)
        kadro.add(marcbola)
        kadro.add(okankocuk)
        kadro.add(olivier)
        kadro.add(yunus)
        kadro.add(zeki)

        var adapter = MyAdapter(kadro)
        binding.recycleView.adapter = adapter
        binding.recycleView.layoutManager = LinearLayoutManager(this)

    }

}