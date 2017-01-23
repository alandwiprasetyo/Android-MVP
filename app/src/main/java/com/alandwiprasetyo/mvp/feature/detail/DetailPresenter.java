package com.alandwiprasetyo.mvp.feature.detail;

import com.alandwiprasetyo.mvp.base.ui.BasePresenter;
import com.alandwiprasetyo.mvp.models.Item;
import com.alandwiprasetyo.mvp.network.NetworkCallback;

/**
 * Created by alandwiprasetyo on 12/27/16.
 */
public class DetailPresenter extends BasePresenter<DetailView> {

    DetailPresenter(DetailView view) {
        super.attachView(view);
    }

    void loadData(String id) {
        view.showLoading();
        addSubscribe(apiStores.getDetailBook(id), new NetworkCallback<Item>() {
            @Override
            public void onSuccess(Item model) {
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

}