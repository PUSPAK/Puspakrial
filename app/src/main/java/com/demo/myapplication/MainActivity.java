package com.demo.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reverse("Hello");
    }



    public String reverse(String string){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = stringBuilder.length() - 1 ;i >= 0 ; i--){
            stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();
    }


}
