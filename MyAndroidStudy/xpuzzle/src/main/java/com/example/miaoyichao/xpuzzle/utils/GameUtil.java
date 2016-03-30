package com.example.miaoyichao.xpuzzle.utils;

import android.content.Intent;

import com.example.miaoyichao.xpuzzle.activity.PuzzleMain;
import com.example.miaoyichao.xpuzzle.bean.ItemBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miaoyichao on 16/3/29.
 */
public class GameUtil {
    public static List<ItemBean> mItemBeans = new ArrayList<ItemBean>();
    public static ItemBean mBlankItemBean = new ItemBean();

    /**
     * 交换空格与点击Item的位置
     */
    public static void swapItems(ItemBean from, ItemBean blank) {
        ItemBean tempItemBean = new ItemBean();
        tempItemBean.setmBitmapId(from.getmBitmapId());
        from.setmBitmapId(blank.getmBitmapId());
        blank.setmBitmapId(tempItemBean.getmBitmapId());
        tempItemBean.setmBitmap(from.getmBitmap());
        from.setmBitmap(blank.getmBitmap());
        blank.setmBitmap(tempItemBean.getmBitmap());
        GameUtil.mBlankItemBean = from;
    }

    /**
     * 生成随即的Item
     */
    public static void getPuzzleGenerator() {
        int index = 0;
        for (int i = 0; i < mItemBeans.size(); i++) {
            index = (int) (Math.random() * PuzzleMain.TYPE * PuzzleMain.TYPE);
            swapItems(mItemBeans.get(index), GameUtil.mBlankItemBean);
        }
        List<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < mItemBeans.size(); i++) {
            data.add(mItemBeans.get(i).getmBitmapId());
        }
        if ()
    }
}
