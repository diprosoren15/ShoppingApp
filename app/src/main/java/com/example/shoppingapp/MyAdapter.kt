package com.example.shoppingapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val datalist : ArrayList<item>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.itemlist, parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = datalist[position]
        holder.img.setImageResource(currentItem.img)
        holder.title.text = currentItem.productname
    }

    override fun getItemCount(): Int {
        return datalist.size
    }
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val img = itemView.findViewById<ImageView>(R.id.itemimg)
        val title = itemView.findViewById<TextView>(R.id.itemname)
    }
}