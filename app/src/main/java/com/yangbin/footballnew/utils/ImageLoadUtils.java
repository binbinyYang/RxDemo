package com.yangbin.footballnew.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;


public class ImageLoadUtils {

    /**
     * 加载图片
     *
     * @param context
     * @param path
     * @param imageView
     */
    public static void display(Context context, Object path, ImageView imageView) {
        Glide.with(context).load(path).into(imageView);
    }

    /**
     * 保存图片到指定手机指定路径
     *
     * @param context
     * @param path     图片网络地址或者本地地址
     * @param dirPath  文件保存的目录
     * @param fileName 文件名称
     */
    public static void saveImage(Context context, Object path, final String dirPath,
                                 final String fileName) {
        Glide.with(context).asBitmap().load(path).into(new SimpleTarget<Bitmap>() {
            @Override
            public void onResourceReady(Bitmap resource, Transition<? super Bitmap> transition) {
                boolean success = ImageUtils.saveImg(resource, dirPath,
                        fileName);
                if (success) {
                    ToastUtils.showShort("文件保存成功");
                }
            }
        });
    }

}
