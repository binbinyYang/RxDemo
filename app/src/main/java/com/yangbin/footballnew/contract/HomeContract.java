package com.yangbin.footballnew.contract;

import com.yangbin.footballnew.base.BaseListener;
import com.yangbin.footballnew.base.BaseModel;
import com.yangbin.footballnew.base.BasePresenter;
import com.yangbin.footballnew.base.BaseView;
import com.yangbin.footballnew.bean.HomeTagBean;

public interface HomeContract {


    interface HomeModel extends BaseModel {

        void loadTag(BaseListener<HomeTagBean> listener);
    }

    interface HomeView extends BaseView {

        void setTagData(HomeTagBean tagBean);
    }

    abstract class HomePresenter extends BasePresenter<HomeModel, HomeView> {

        public abstract void loadData(boolean isRefresh);
    }

}
