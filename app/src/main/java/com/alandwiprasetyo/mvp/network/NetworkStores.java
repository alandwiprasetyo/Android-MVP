package com.alandwiprasetyo.mvp.network;

import com.alandwiprasetyo.mvp.models.Books;
import com.alandwiprasetyo.mvp.models.Item;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by alandwiprasetyo on 11/22/16.
 */

public interface NetworkStores {
    @GET("volumes")
    Observable<Books> getTopBooks(@Query("q") String key);

    @GET("volumes/{id}")
    Observable<Item> getDetailBook(@Path("id") String id);
}