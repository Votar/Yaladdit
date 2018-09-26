package com.xyz.yaladdit.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.xyz.yaladdit.R
import kotlinx.android.synthetic.main.activity_main.*

class TopActivity : AppCompatActivity(), TopContract.View {

    val presenter: TopPresenter by lazy { ViewModelProviders.of(this).get(TopPresenter::class.java) }

    val vPostList: RecyclerView get() = top_list

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        presenter.bind(this)
    }

    override fun onStop() {
        super.onStop()
        presenter.unbind()
    }
}
