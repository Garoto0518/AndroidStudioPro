package com.garoto.musscout;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by mathl on 3/1/2018.
 */

public class MusScout extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }

//    @Override
//    public void onCreate(){
//        super.onCreate();
//    }
}
