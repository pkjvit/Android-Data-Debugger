/*
 * Copyright (C) 2018 Pankaj Jangid
 * Copyright (C) 2011 Android Open Source Project
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.pkj.wow.android.datadebugsample.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ClipTextDbHelper extends SQLiteOpenHelper {

    private static final String SQL_CREATE_CLIPTEXT =
            "CREATE TABLE " + ClipTextContract.ClipTextEntry.TABLE_NAME + " (" +
                    ClipTextContract.ClipTextEntry._ID + " INTEGER PRIMARY KEY," +
                    ClipTextContract.ClipTextEntry.COLUMN_NAME_TEXT + " TEXT," +
                    ClipTextContract.ClipTextEntry.COLUMN_NAME_PIN + " INTEGER," +
                    ClipTextContract.ClipTextEntry.COLUMN_NAME_STAR + " INTEGER," +
                    ClipTextContract.ClipTextEntry.COLUMN_NAME_TIME_STAMP + " TEXT)";

    private static final String SQL_DELETE_CLIPTEXT =
            "DROP TABLE IF EXISTS " + ClipTextContract.ClipTextEntry.TABLE_NAME;

    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "ClipText.db";

    public ClipTextDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_CLIPTEXT);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_CLIPTEXT);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}