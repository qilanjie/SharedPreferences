package com.qwh.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyData myData=new MyData(getApplicationContext());
        myData.setNumber(1000);
        myData.save();
        int y=myData.load();
                String LOG="myLog";
        Log.d(LOG,"onCreate:"+y);
//        SharedPreferences sharedPreferences=getPreferences(Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor=sharedPreferences.edit();
//        editor.putInt("NUMBER",200);
//        editor.apply();
//        int x=sharedPreferences.getInt("NUMBER",0);
//        String LOG="myLog";
//        Log.d(LOG,"onCreate:"+x);
    }
}