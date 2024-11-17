package com.example.futboltakmlistesi

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var kadro: List<Oyuncu>)
    : RecyclerView.Adapter<MyAdapter.myViewHolder>() {
        class myViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            var textViewIsim = itemView.findViewById<TextView>(R.id.name)
            var textViewPosition = itemView.findViewById<TextView>(R.id.playerPosition)
            var textViewNumber = itemView.findViewById<TextView>(R.id.uniformNumber)
            var textViewImage = itemView.findViewById<ImageView>(R.id.imageView)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.second_page,parent, false)
        return myViewHolder(view)

    }

    override fun getItemCount(): Int {
        return kadro.size
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        holder.textViewIsim.text = kadro[position].name
        holder.textViewNumber.text = kadro[position].uniformNumber
        holder.textViewPosition.text = kadro[position].position
        holder.textViewImage.setImageResource(kadro[position].image)

        holder.itemView.setOnClickListener {
            var intent = Intent(holder.itemView.context, detay::class.java)
            intent.putExtra("image", kadro[position].image)
            intent.putExtra("age", kadro[position].age)
            intent.putExtra("name", kadro[position].name)
            intent.putExtra("totalGoal", kadro[position].totalGoal)
            intent.putExtra("totalMatch", kadro[position].playedMatch)

            holder.itemView.context.startActivity(intent)
        }

     }
}