package com.example.practice_42;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment, Fragm1.class, null).commit();

        FragmentManager fragmentManager = getSupportFragmentManager();


        btn1 = findViewById(R.id.btn_frg1);
        btn2 = findViewById(R.id.btn_frg2);
        btn3 = findViewById(R.id.btn_frg3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragm1 fragm1 = new Fragm1();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_imp, fragm1, "fragment1");
                fragmentTransaction.commit();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragm2 fragm2 = new Fragm2();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_imp, fragm2, "fragment2");
                fragmentTransaction.commit();

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragm3 fragm3 = new Fragm3();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_imp, fragm3, "fragment3");
                fragmentTransaction.commit();

            }
        });


    }
}