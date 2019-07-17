package com.yangbin.footballnew.presenter;

import com.yangbin.footballnew.base.BaseListener;
import com.yangbin.footballnew.bean.HomeTagBean;
import com.yangbin.footballnew.contract.HomeContract;



public class HomePresenterImpl extends HomeContract.HomePresenter{

    @Override
    public void loadData(boolean isRefresh) {
        final HomeContract.HomeView mView = getView();
        if (mView == null) return;

        mModel.loadTag(new BaseListener<HomeTagBean>() {
            @Override
            public void onSuccess(HomeTagBean result) {

                mView.setTagData(result);
            }

            @Override
            public void onError(String msg) {

            }
        });
    }

}
