package com.example.miaoyichao.myandroidstudy;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import cn.bmob.push.PushConstants;

/**
 * Created by miaoyichao on 16/3/29.
 */
public class MyPushMessageReceiver extends BroadcastReceiver {
    private String message;

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(PushConstants.ACTION_MESSAGE)) {
            Log.d("bmob", "客户端收到推送内容：" + intent.getStringExtra("msg"));


            JSONTokener jsonTokener = new JSONTokener(intent.getStringExtra("msg"));

            try {
                JSONObject jsonObject = (JSONObject) jsonTokener.nextValue();
                message = jsonObject.getString("alert");
            } catch (JSONException e) {
                e.printStackTrace();
            }

            NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
            Notification notification = new Notification.Builder(context)
                    .setSmallIcon(R.mipmap.ic_launcher)
                    .setTicker("新的消息")
                    .setContentTitle("Notification Title")
                    .setContentText(message)
                    .setNumber(1).build();

            manager.notify(1, notification);


        }
    }
}
