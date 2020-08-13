package com.news.samridhi.k;

import android.app.Application;

public class MyNewsApplication extends Application {
    private static MyNewsApplication myNewsApplicationInstance;
    @Override
    public void onCreate() {
        super.onCreate();
        myNewsApplicationInstance = this;
    }
    public static MyNewsApplication getMyNewsApplicationInstance(){
        return myNewsApplicationInstance;
    }
}
