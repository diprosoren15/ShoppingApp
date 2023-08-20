package com.example.shoppingapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private lateinit var adapter: MyAdapter
private lateinit var recyclerView : RecyclerView
private lateinit var itemlist : ArrayList<item>

private lateinit var img : Array<Int>
private lateinit var items: Array<String>

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialise()
        val layoutmanager = GridLayoutManager(context,2)
        recyclerView = view.findViewById(R.id.recyclerview)
        recyclerView.layoutManager = layoutmanager
        adapter = MyAdapter(itemlist)
        recyclerView.adapter = adapter
    }

    private fun initialise() {
        itemlist = arrayListOf<item>()
        img = arrayOf(R.drawable.men,R.drawable.women,R.drawable.kids,R.drawable.beauty)
        items = arrayOf("Mens", "Women", "Kids", "Beauty")

        for (index in img.indices) {
            val listofitems = item(img[index], items[index])
            itemlist.add(listofitems)
        }
    }
}