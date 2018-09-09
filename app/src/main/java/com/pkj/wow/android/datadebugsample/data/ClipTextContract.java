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

import android.provider.BaseColumns;

public final class ClipTextContract {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private ClipTextContract() {}

    /* Inner class that defines the table contents */
    public static class ClipTextEntry implements BaseColumns {
        public static final String TABLE_NAME = "clip_text";
        public static final String COLUMN_NAME_TEXT = "text";
        public static final String COLUMN_NAME_PIN = "pin";
        public static final String COLUMN_NAME_STAR = "star";
        public static final String COLUMN_NAME_TIME_STAMP = "time_stamp";
    }
}