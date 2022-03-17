package com.example.rozanfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button firstFragment, secondFragment, thirdFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstFragment = findViewById(R.id.btn1);
        secondFragment = findViewById(R.id.btn2);
        thirdFragment = findViewById(R.id.btn3);

        FragmentManager fm = getSupportFragmentManager();
        firstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction tf = fm.beginTransaction();
                tf.replace(R.id.fcv, new fragmentRed()).commit();
            }
        });
        secondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction tf = fm.beginTransaction();
                tf.replace(R.id.fcv, new fragmentGreen()).commit();
            }
        });
        thirdFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction tf = fm.beginTransaction();
                tf.replace(R.id.fcv, new fragmentBlue()).commit();


            }
        });
    }
}