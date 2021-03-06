package com.xyz.yaladdit.api.model

class TopResponse(val data: DataResponse)

class DataResponse(val children: List<RedditChildrenResponse>, val after: String?, val before: String?)

class RedditChildrenResponse(val data: RedditNewsDataResponse)

class RedditNewsDataResponse(
        val author: String,
        val title: String,
        val num_comments: Int,
        val created: Long,
        val thumbnail: String,
        val url: String?
)