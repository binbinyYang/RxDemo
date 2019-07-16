package com.yangbin.footballnew.base;

/**
 * 用于数据从 M 到 V 的层间传递。
 */

public interface BaseListener<T> {

    void onSuccess(T result);

    void onError(String msg);
}
