package com.xyz.yaladdit.ui.main

import androidx.lifecycle.ViewModel
import com.xyz.yaladdit.api.RedditApi
import com.xyz.yaladdit.api.model.TopResponse
import com.xyz.yaladdit.base.ArchContract
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TopPresenter : ViewModel(), ArchContract.Presenter<TopContract.View> {

    private var view: TopContract.View? = null

    override fun bind(view: TopContract.View) {
        this.view = view
        RedditApi.service.getTop("0", "16").enqueue(object : Callback<TopResponse> {
            override fun onFailure(call: Call<TopResponse>, t: Throwable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: Call<TopResponse>, response: Response<TopResponse>) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
    }

    override fun unbind() {
        view = null
    }


}