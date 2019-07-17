package com.yangbin.footballnew.activity;

import android.os.Bundle;
import android.widget.TextView;

import com.yangbin.footballnew.R;
import com.yangbin.footballnew.base.BaseActivity;
import com.yangbin.footballnew.bean.HomeTagBean;
import com.yangbin.footballnew.contract.HomeContract;
import com.yangbin.footballnew.modle.HomeModelImpl;
import com.yangbin.footballnew.presenter.HomePresenterImpl;

public class HomeActivity extends BaseActivity<HomePresenterImpl, HomeModelImpl>implements HomeContract.HomeView {
    private HomeTagBean tagBean;
    String a;
    private TextView tv;
    @Override
    protected HomePresenterImpl createPresenter() {
        return new HomePresenterImpl();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViewAndEvent(Bundle savedInstanceState) {

        tv = (TextView)findViewById(R.id.tv_content);
        tv.setText( a);
    }

    @Override
    public void setTagData(HomeTagBean tagBean) {
        this.tagBean = tagBean;

          a = tagBean.toString();
    }
}
