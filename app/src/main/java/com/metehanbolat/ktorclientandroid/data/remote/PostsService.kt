package com.metehanbolat.ktorclientandroid.data.remote

import com.metehanbolat.ktorclientandroid.data.remote.dto.PostRequest
import com.metehanbolat.ktorclientandroid.data.remote.dto.PostResponse

interface PostsService {

    suspend fun getPosts() : List<PostResponse>
    suspend fun createPost(postRequest: PostRequest) : PostResponse?
}