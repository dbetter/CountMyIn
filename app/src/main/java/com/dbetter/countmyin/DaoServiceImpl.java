package com.dbetter.countmyin;

import android.content.Context;

public class DaoServiceImpl {

    public static DaoLayer instance = null;

    public DaoLayer getInstance(Context context) {
        if (instance == null) {
            instance = new DaoLayer(context);
        }
        return instance;
    }
}
