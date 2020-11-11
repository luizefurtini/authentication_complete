package com.example.authentication.Data;

import com.example.authentication.Utils.FirebaseDatabaseClass;

public class FirebaseRepository {

   static FirebaseRepository INSTANCE;

    public static FirebaseRepository getInstance(){

        if (INSTANCE == null) {

            INSTANCE = new FirebaseRepository();

        }

        return INSTANCE;
    }


    public void getDatabaseUser(){

        FirebaseDatabaseClass.getFirebaseDatabaseClassInstance().getDatabaseUserData();
        FirebaseDatabaseClass.getFirebaseDatabaseClassInstance().getDatabaseReference();
    }
}
