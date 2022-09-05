package com.huda.aplikasiku

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailAdapter (private val listArticle : ArrayList<Article>) : RecyclerView.Adapter<DetailAdapter.DetailViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailAdapter.DetailViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_detail_cardview, parent, false)
        return DetailViewHolder(view)
    }

    override fun onBindViewHolder(holder: DetailAdapter.DetailViewHolder, position: Int) {
        val article = listArticle[position]
        Glide.with(holder.itemView.context)
            .load(article.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = article.title
        holder.tvDetail.text = article.description
//        holder.tvWriter.text = article.writer
//        holder.tvDate.text = article.date
        holder.btnDetail.setOnClickListener { Toast.makeText(holder.itemView.context, "Favorite " + listArticle[holder.adapterPosition].title, Toast.LENGTH_SHORT).show() }
        holder.itemView.setOnClickListener { Toast.makeText(holder.itemView.context, "Kamu memilih " + listArticle[holder.adapterPosition].title, Toast.LENGTH_SHORT).show() }

    }

    override fun getItemCount(): Int {
        return listArticle.size
    }

    inner class DetailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnDetail: Button = itemView.findViewById(R.id.btn_set_detail)

    }
}