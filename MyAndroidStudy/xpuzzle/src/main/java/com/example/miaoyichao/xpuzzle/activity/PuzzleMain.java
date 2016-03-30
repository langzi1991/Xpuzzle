package com.example.miaoyichao.xpuzzle.activity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.miaoyichao.xpuzzle.R;

/**
 * Created by miaoyichao on 16/3/29.
 */
public class PuzzleMain extends AppCompatActivity {
    // 拼图完成时显示的最后一个图片
    public static Bitmap mLastBitmap;
    // 设置为N*N显示
    public static int TYPE = 2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xpuzzle_puzzle_detail_main);
    }
}
