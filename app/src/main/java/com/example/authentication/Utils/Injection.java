package com.example.authentication.Utils;

import android.support.v4.app.INotificationSideChannel;

import com.example.authentication.Data.FirebaseRepository;

public class Injection {

   static Injection INSTANCE;

    public  static  Injection getInstance(){

        if (INSTANCE == null) {

            INSTANCE = new Injection();

        }

        return INSTANCE;

    }

    public void getDatabaseUser(){
        FirebaseRepository.getInstance().getDatabaseUser();
    }
}
