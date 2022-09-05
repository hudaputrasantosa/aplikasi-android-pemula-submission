package com.huda.aplikasiku

import android.content.Intent
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

class CardViewAdapter(private val listArticle : ArrayList<Article>) : RecyclerView.Adapter<CardViewAdapter.CardViewViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_data, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val article = listArticle[position]
        Glide.with(holder.itemView.context)
            .load(article.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = article.title
        holder.tvDetail.text = article.description

        val context = holder.itemView.context
        holder.btnDetail.setOnClickListener {
            val detailIntent = Intent(context, DetailActivity::class.java)
            detailIntent.putExtra(DetailActivity.EXTRA_PHOTO, article.photo)
            detailIntent.putExtra(DetailActivity.EXTRA_TITLE, article.title)
            detailIntent.putExtra(DetailActivity.EXTRA_DATE, article.date)
            detailIntent.putExtra(DetailActivity.EXTRA_DESCRIPTION, article.description)
            detailIntent.putExtra(DetailActivity.EXTRA_WRITER, article.writer)
            context.startActivity(detailIntent)
        }
    }

    override fun getItemCount(): Int {
        return listArticle.size
    }
    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnDetail: Button = itemView.findViewById(R.id.btn_set_detail)

    }
}