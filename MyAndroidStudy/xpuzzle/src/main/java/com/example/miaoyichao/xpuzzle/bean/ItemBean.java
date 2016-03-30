package com.example.miaoyichao.xpuzzle.bean;

import android.graphics.Bitmap;

/**
 * Created by miaoyichao on 16/3/29.
 */
public class ItemBean {
    private int mItemId;
    private int mBitmapId;
    private Bitmap mBitmap;

    public ItemBean() {

    }

    public ItemBean(int mItemId, int mBitmapId, Bitmap mBitmap) {
        this.mBitmap = mBitmap;
        this.mBitmapId = mBitmapId;
        this.mItemId = mItemId;
    }

    public Bitmap getmBitmap() {
        return mBitmap;
    }

    public int getmBitmapId() {
        return mBitmapId;
    }

    public int getmItemId() {
        return mItemId;
    }

    public void setmBitmap(Bitmap mBitmap) {
        this.mBitmap = mBitmap;
    }

    public void setmBitmapId(int mBitmapId) {
        this.mBitmapId = mBitmapId;
    }

    public void setmItemId(int mItemId) {
        this.mItemId = mItemId;
    }
}
