package com.dbetter.countmyin;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DaoLayer extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "CountMyIn.db";
    public static final String TABLE_NAME = "account_information";
    public static final String COL_ID = "id";
    public static final String COL_YEAR = "year";
    public static final String COL_MONTH = "month";
    public static final String COL_DAY = "day";
    public static final String COL_ARRIVAL = "arrival";
    public static final String COL_DEPARTURE = "departure";

    public DaoLayer(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create table query
        db.execSQL("CREATE TABLE " + TABLE_NAME + " (id INTEGER PRIMARY KEY AUTOINCREMENT, year INTEGER, month INTEGER, day INTEGER, arrival INTEGER, departure INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
    }


    public void insertManaulArrivalData(int year, int month, int day, int time) {

    }

    public void insertManaulDepartureData(int year, int month, int day, int time) {

    }
}
