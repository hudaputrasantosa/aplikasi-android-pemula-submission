package com.huda.aplikasiku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class DetailActivity : AppCompatActivity() {
    private lateinit var rvArticle: RecyclerView
    private var list: ArrayList<Article> = arrayListOf()
    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    companion object {
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DESCRIPTION = "extra_description"
        const val EXTRA_WRITER = "extra_writer"
        const val EXTRA_DATE = "extra_date"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setActionBarTitle("Detail Article")

        val tvPhoto : ImageView = findViewById(R.id.iv_article)
        val tvTitle : TextView = findViewById(R.id.tv_title)
        val tvDate : TextView = findViewById(R.id.tv_date)
        val tvDescription : TextView = findViewById(R.id.tv_description)
        val tvWriter : TextView = findViewById(R.id.tv_writer)

        val tPhoto  = intent.getIntExtra(EXTRA_PHOTO,0)
        val tTitle  = intent.getStringExtra(EXTRA_TITLE)
        val tDate  = intent.getStringExtra(EXTRA_DATE)
        val tDescription   = intent.getStringExtra(EXTRA_DESCRIPTION)
        val tWriter  = intent.getStringExtra(EXTRA_WRITER)

        tvTitle.text = tTitle
        tvPhoto.setImageResource(tPhoto)
        tvDate.text = tDate
        tvDescription.text = tDescription
        tvWriter.text = tWriter
    }


}