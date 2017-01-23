package com.alandwiprasetyo.mvp.feature.home;

import android.app.Activity;
import android.content.Intent;

import com.alandwiprasetyo.mvp.base.ui.BasePresenter;
import com.alandwiprasetyo.mvp.feature.detail.DetailActivity;
import com.alandwiprasetyo.mvp.models.Books;
import com.alandwiprasetyo.mvp.models.Item;
import com.alandwiprasetyo.mvp.network.NetworkCallback;

/**
 * Created by alandwiprasetyo on 11/22/16.
 */

class MainPresenter extends BasePresenter<MainView> {

    MainPresenter(MainView view) {
        super.attachView(view);
    }

    void loadData(String key) {
        view.showLoading();
        addSubscribe(apiStores.getTopBooks(key), new NetworkCallback<Books>() {
            @Override
            public void onSuccess(Books model) {
                view.getDataSuccess(model);
            }

            @Override
            public void onFailure(String message) {
                view.getDataFail(message);
            }

            @Override
            public void onFinish() {
                view.hideLoading();
            }
        });
    }

    void getItem(Item item, Activity activity) {
        Intent intent = new Intent(activity, DetailActivity.class);
        intent.putExtra("id", item.getId());
        view.moveToDetail(intent);
    }
}