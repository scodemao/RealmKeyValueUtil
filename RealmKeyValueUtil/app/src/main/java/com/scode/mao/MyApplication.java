package com.scode.mao;

import android.app.Application;

import mao.scode.com.realmutils.RealmKVHelper;

/**
 * Created by maoweiwei on 16/7/6
 * RealmKeyValueUtil
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 在Application 中进行初始化
        RealmKVHelper.initialize(this);

    }
}
