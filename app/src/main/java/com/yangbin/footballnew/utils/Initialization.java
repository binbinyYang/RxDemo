package com.yangbin.footballnew.utils;

import android.content.Context;

/**
 * 工具类初始化
 */

public class Initialization {

    public static final boolean DEBUG = true;

    public Initialization(Context context) {
        this.context = context;
    }

    private static Context context;

    public static Context getContext() {
        return context;
    }





}
