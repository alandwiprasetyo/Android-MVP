package com.alandwiprasetyo.mvp.feature.home;

import android.content.Intent;

import com.alandwiprasetyo.mvp.models.Books;

/**
 * Created by alandwiprasetyo on 11/22/16.
 */
interface MainView {
    void showLoading();

    void hideLoading();

    void getDataSuccess(Books model);

    void getDataFail(String message);

    void moveToDetail(Intent intent);

}
