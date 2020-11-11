package com.example.authentication.Utils;

import com.google.firebase.database.DatabaseReference;

public class FirebaseDatabase {

    static FirebaseDatabase INSTANCE;

   FirebaseDatabase firebaseDatabase;

    DatabaseReference myRef;

    public static FirebaseDatabase getFirebaseDatabaseInstance(){

        if (INSTANCE == null) {
            INSTANCE = new FirebaseDatabase();
        }

        return INSTANCE;
    }
}
