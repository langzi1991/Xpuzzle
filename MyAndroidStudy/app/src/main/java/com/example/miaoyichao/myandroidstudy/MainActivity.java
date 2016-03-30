package com.example.miaoyichao.myandroidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.bmob.push.BmobPush;
import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobInstallation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 初始化BmobSDK
//        Bmob.initialize(this, "3163635f66ed86597754f72235d50b17");
        // 使用推送服务时的初始化操作
        BmobInstallation.getCurrentInstallation(this).save();
        // 启动推送服务
        BmobPush.startWork(this, "3163635f66ed86597754f72235d50b17");

//        Bmob.initialize(this, "3163635f66ed86597754f72235d50b17");
    }
}
