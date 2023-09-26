package com.example.taskmuse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics; // Firebase Analytics

public class MainActivity extends AppCompatActivity {
    private FirebaseAnalytics mFirebaseAnalytics;     // Firebase Analytics variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this); // Obtain the FirebaseAnalytics instance.

        setContentView(R.layout.activity_main);
    }
}