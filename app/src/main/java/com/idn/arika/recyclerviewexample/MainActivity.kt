package com.idn.arika.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {

    private val list = ArrayList<SuperHero>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_superhero.setHasFixedSize(true)
        list.addAll(getListSuperhero())
        rv_superhero.LayoutManager = LinearLayoutManager (this)
        val superHeroAdapter = SuperHeroAdapter(list)
        rv_superhero.adapter = superHeroAdapter

        superHeroAdapter.setOnItemClickCallback(object : SuperHeroAdapter.OnItemClickCallback{
            override fun onItemClick(data: SuperHero) {
                Toast.makeText(this@MainActivity, data.name. Toast.LENGTH.SHORT).show()
            }


        })

    }
    private fun getListSuperhero(): ArrayList<SuperHero>{
        val name = resources.getStringArray(R.array.data_name)
        val desc = resources.getStringArray(R.array.data_desc)

        val listSuperHero = ArrayList<SuperHero>()
        for (i in name.indices){
            val superHero = SuperHero(
                name[i],
                desc[i]
            )
            listSuperHero.add(superHero)
        }
        return listSuperHero


    }
}