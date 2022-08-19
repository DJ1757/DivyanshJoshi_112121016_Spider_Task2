package com.example.aviationstack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        val recyclerView:RecyclerView=findViewById(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this)
        val items=fetchData()
        val adapter:FlightsDataAdapter= FlightsDataAdapter(items )
        recyclerView.adapter=adapter


    }
    private fun fetchData(): ArrayList<String> {
        val list=ArrayList<String>()
        for(i in 0 until 100){
            list.add("iteem $i")

        }
        return list
    }
}