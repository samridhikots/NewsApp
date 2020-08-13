package com.news.samridhi.k.util;

import android.content.Context;
import android.net.ConnectivityManager;

import com.news.samridhi.k.MyNewsApplication;

public class UtilityMethods {

    public static boolean isNetworkAvailable() {

        ConnectivityManager connectivityManager = (ConnectivityManager) MyNewsApplication.getMyNewsApplicationInstance()
                        .getSystemService(Context.CONNECTIVITY_SERVICE);

        return connectivityManager.getActiveNetworkInfo() != null
                && connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting();
    }


}
