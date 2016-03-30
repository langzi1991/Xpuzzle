package com.example.miaoyichao.xpuzzle.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.R.color;

import com.example.miaoyichao.xpuzzle.utils.ScreenUtil;

import java.util.List;

/**
 * Created by miaoyichao on 16/3/29.
 */
public class GridPicListAdapter extends BaseAdapter {
    private List<Bitmap> picList;
    private Context context;

    public GridPicListAdapter(Context context, List<Bitmap> picList) {
        this.context = context;
        this.picList = picList;
    }


    @Override
    public int getCount() {
        return picList.size();
    }

    @Override
    public Object getItem(int position) {
        return picList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView iv_pic_item = null;
        int density = (int) ScreenUtil.getDeviceDensity(context);
        if (convertView == null) {
            iv_pic_item = new ImageView(context);
            iv_pic_item.setLayoutParams(new GridView.LayoutParams(80 * density, 100 * density));
            iv_pic_item.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            iv_pic_item = (ImageView) convertView;
        }
        iv_pic_item.setBackgroundColor(color.black);
        iv_pic_item.setImageBitmap(picList.get(position));
        return iv_pic_item;
    }
}
