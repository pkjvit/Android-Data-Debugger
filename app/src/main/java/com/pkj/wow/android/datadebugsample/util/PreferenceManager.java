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

package com.pkj.wow.android.datadebugsample.util;

import android.content.Context;
import android.content.SharedPreferences;


/**
 * Created by Pankaj on 31-05-2015.
 */
public class PreferenceManager {


    // Shared Preferences
    private static SharedPreferences pref;

    // Editor for Shared preferences
    private static SharedPreferences.Editor editor;

    // Context
    private Context _context;

    // Sharedpref file name
    private static final String PREF_NAME = "pkj.classickeyboard";

    public static final String SILENCE_NOTIFICATION     = "silence_notification";
    public static final String AUTO_HIDE_POPUP          = "auto_hide_popup";
    public static final String AUTO_HIDE_floating       = "auto_hide_floating";

    public static final String NOTIFICATION_TYPE            = "notification_type";
    public static final String NOTIFICATION_ENABLE          = "notification_enable";
    public static final String NOTIFICATION_PANEL_ENABLE    = "notification_panel_enable";
    public static final String LAST_FLOATING_ICON_Y_OFFSET  = "last_floating_icon_y_offset";
    public static final String TOUCH_OUTSIDE_POPUP_ENABLE   = "touch_outside_popup_enable";

    public static final String SENTENCE_COPY_ENABLE         = "sentence_copy_enable";
    public static final String LAST_WORD_SEARCHED           = "last_word_searched";

    public static final String TUTORIAL_SHOWN               = "tutorial_shown";
    public static final String NIGHT_MODE_ON                = "night_mode_on";
    public static final String DEFAULT_LANGUAGE             = "default_language";
    public static final String DEFAULT_LANGUAGE_CODE        = "default_language_code";

    // Initialise preference object
    public static SharedPreferences getPrefInstance(Context context) {
        if (pref == null) {
            pref = context.getSharedPreferences(PREF_NAME, context.MODE_PRIVATE);
        }
        return pref;
    }

    // Initialise editor for insert and update
    public static SharedPreferences.Editor getEditor(Context context) {
        getPrefInstance(context);
        if (editor == null) {
            editor = pref.edit();
        }
        return editor;
    }

    public static void initPref(Context context){
        getPrefInstance(context);
        setSilenceNotificationEnable(context, false);
        setAutoHideFloaingEnable(context, false);
        setDefaultLanguage(context, "en");
        setNightModeEnable(context, false);
        setNotificationEnable(context, false);
    }

    public static void setSilenceNotificationEnable(Context context, boolean isEnable){
        editor = getEditor(context);
        editor.putBoolean(SILENCE_NOTIFICATION, isEnable);
        editor.commit();
    }

    public static boolean isSilenceNotificationEnable(Context context){
        getPrefInstance(context);
        return  pref.getBoolean(SILENCE_NOTIFICATION,false);
    }

    public static void setAutoHidePopupEnable(Context context, boolean isEnable){
        editor = getEditor(context);
        editor.putBoolean(AUTO_HIDE_POPUP, isEnable);
        editor.commit();
    }

    public static boolean isAutoHidePopupEnable(Context context){
        getPrefInstance(context);
        return  pref.getBoolean(AUTO_HIDE_POPUP,false);
    }

   public static void setTouchOutsidePopupEnable(Context context, boolean isEnable){
        editor = getEditor(context);
        editor.putBoolean(TOUCH_OUTSIDE_POPUP_ENABLE, isEnable);
        editor.commit();
    }

    public static boolean isTouchOutsidePopupEnable(Context context){
        getPrefInstance(context);
        return  pref.getBoolean(TOUCH_OUTSIDE_POPUP_ENABLE,true);
    }

    public static void setTutoiralShown(Context context, boolean isShown){
        editor = getEditor(context);
        editor.putBoolean(TUTORIAL_SHOWN, isShown);
        editor.commit();
    }

    public static boolean isTutoiralShown(Context context){
        getPrefInstance(context);
        return  pref.getBoolean(TUTORIAL_SHOWN,false);
    }

    public static void setAutoHideFloaingEnable(Context context, boolean isEnable){
        editor = getEditor(context);
        editor.putBoolean(AUTO_HIDE_floating, isEnable);
        editor.commit();
    }

    public static boolean isAutoHideFloatingEnable(Context context){
        getPrefInstance(context);
        return  pref.getBoolean(AUTO_HIDE_floating,true);
    }

    public static void setNotificationEnable(Context context, boolean isEnable){
        editor = getEditor(context);
        editor.putBoolean(NOTIFICATION_ENABLE, isEnable);
        editor.commit();
    }

    public static boolean isNotificationEnable(Context context){
        getPrefInstance(context);
        return  pref.getBoolean(NOTIFICATION_ENABLE,true);
    }

     public static void setNotificationPanelEnable(Context context, boolean isEnable){
        editor = getEditor(context);
        editor.putBoolean(NOTIFICATION_PANEL_ENABLE, isEnable);
        editor.commit();
    }

    public static boolean isNotificationPanelEnable(Context context){
        getPrefInstance(context);
        return  pref.getBoolean(NOTIFICATION_PANEL_ENABLE,true);
    }

    public static void setNotificationType(Context context, int type){
        editor = getEditor(context);
        editor.putInt(NOTIFICATION_TYPE, type);
        editor.commit();
    }

    public static int getNotificationType(Context context){
        getPrefInstance(context);
        return  pref.getInt(NOTIFICATION_TYPE,0);
    }

    public static void setLastFloatingIconYOffset(Context context, int yOffset){
        editor = getEditor(context);
        editor.putInt(LAST_FLOATING_ICON_Y_OFFSET, yOffset);
        editor.commit();
    }

    public static int getLastFloatingIconYOffset(Context context){
        getPrefInstance(context);
        return  pref.getInt(LAST_FLOATING_ICON_Y_OFFSET, 250);
    }

    public static void setSentenseCopyEnable(Context context, boolean isEnable){
        editor = getEditor(context);
        editor.putBoolean(SENTENCE_COPY_ENABLE, isEnable);
        editor.commit();
    }

    public static boolean isSentenseCopyEnable(Context context){
        getPrefInstance(context);
        return  pref.getBoolean(SENTENCE_COPY_ENABLE,true);
    }

    public static void setLastSearchedWord(Context context, String word){
        editor = getEditor(context);
        editor.putString(LAST_WORD_SEARCHED, word);
        editor.commit();
    }

    public static String getLastSearchedWord(Context context){
        getPrefInstance(context);
        return  pref.getString(LAST_WORD_SEARCHED, "Describe");
    }

    public static void setNightModeEnable(Context context, boolean isEnable){
        editor = getEditor(context);
        editor.putBoolean(NIGHT_MODE_ON, isEnable);
        editor.commit();
    }

    public static boolean isNightModeEnable(Context context){
        getPrefInstance(context);
        return  pref.getBoolean(NIGHT_MODE_ON,false);
    }

    public static void setDefaultLanguage(Context context, String lang){
        editor = getEditor(context);
        editor.putString(DEFAULT_LANGUAGE, lang);
        editor.commit();
    }

    public static String getDefaultLanguage(Context context){
        getPrefInstance(context);
        return  pref.getString(DEFAULT_LANGUAGE, "Hindi");
    }

    public static void setDefaultLanguageCode(Context context, String lang){
        editor = getEditor(context);
        editor.putString(DEFAULT_LANGUAGE_CODE, lang);
        editor.commit();
    }

    public static String getDefaultLanguageCode(Context context){
        getPrefInstance(context);
        return  pref.getString(DEFAULT_LANGUAGE_CODE, "hi");
    }
}
