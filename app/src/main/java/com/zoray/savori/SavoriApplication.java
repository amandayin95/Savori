package com.zoray.savori;

import android.app.Application;

import com.parse.Parse;

public class SavoriApplication extends Application {

    public static final String APPLICATION_ID = "OOi4NEtRfUOrTVcaUodMZ2y9KLyQUbdqb6k2rHXr";
    public static final String CLIENT_KEY = "vaHgmYvBeV3GLVO9Y7lNN93ZVP6D9Vi3qc1S9zbd";

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(this, APPLICATION_ID, CLIENT_KEY);
    }
}