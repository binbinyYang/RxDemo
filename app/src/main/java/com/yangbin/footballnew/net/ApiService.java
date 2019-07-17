package com.yangbin.footballnew.net;


import com.yangbin.footballnew.bean.HomeTagBean;

import io.reactivex.Observable;
import retrofit2.http.GET;


public interface ApiService {

    @GET(ApiConstants.API_HOME_TAG)
    Observable<HomeTagBean> getTagData();








    //https://api.qiuduoduo.cn/posts/438166 这个详情页的数据
}
