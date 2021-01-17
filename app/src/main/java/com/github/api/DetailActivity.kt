package com.github.api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DetailActivity : AppCompatActivity(),  View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.apply {
            elevation = 0f
            title = ""
        }
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}