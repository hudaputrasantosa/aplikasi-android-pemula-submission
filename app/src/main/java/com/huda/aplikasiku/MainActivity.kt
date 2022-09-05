package com.huda.aplikasiku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvArticle: RecyclerView
    private var list: ArrayList<Article> = arrayListOf()
    private var title = "Blogtivity"

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvArticle = findViewById(R.id.rv_article)
        rvArticle.setHasFixedSize(true)

        list.addAll(ArticleData.listData)
        showRecyclerCardView()


//        val btnDetail : Button = findViewById(R.id.btn_set_detail)
//        btnDetail.setOnClickListener(this)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerCardView() {
        rvArticle.layoutManager = LinearLayoutManager(this)
        val cardViewArticleAdapter = CardViewAdapter(list)
        rvArticle.adapter = cardViewArticleAdapter
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {

            R.id.about_page -> {
                val aboutIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(aboutIntent)
            }
        }
    }
}