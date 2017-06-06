package com.example.ar.retrofitporttest

import io.reactivex.Observable
import retrofit2.http.GET

/**
 * Created by AR on 06/06/2017.
 */
interface Api {

    @GET("/")
    fun get(): Observable<String>
}