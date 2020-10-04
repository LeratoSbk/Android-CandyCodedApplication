package com.pluralsight.candycoded.DB;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.pluralsight.candycoded.DetailActivity;

public class CandyDbHelper extends SQLiteOpenHelper {
   /** public CandyDbHelper(DetailActivity context) { */
         public CandyDbHelper(Activity context) {
        super(context,
              CandyContract.DB_NAME,
              null,
              CandyContract.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CandyContract.SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(CandyContract.SQL_DELETE_ENTRIES);
        onCreate(db);
    }
}
