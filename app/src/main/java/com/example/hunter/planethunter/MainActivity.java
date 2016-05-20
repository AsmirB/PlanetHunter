package com.example.hunter.planethunter;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSolarSystem(View view) {
        // Do something in response to button click
        new AlertDialog.Builder(this)
                .setTitle("Your Alert")
                .setMessage("Your Message")
                .setCancelable(false).create().show();
    }
}
