package com.example.cinema.component.network

import retrofit2.Retrofit

inline fun <reified T> createRetrofitService(retrofit: Retrofit): T =
	retrofit.create(T::class.java)