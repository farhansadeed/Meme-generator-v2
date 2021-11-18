package com.example.memegen2;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements Top_fragment.topFragmentListener{

    public GlobalClass amazon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Fragment newFragment = new Top_fragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.fragment_loader, newFragment).commit();
    }




    @Override
    public void creatememe(String textTop, String textBottom) {

        Fragment load_fragment = new Bottom_fragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();



        fragmentTransaction.replace(R.id.fragment_loader, load_fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

        amazon = GlobalClass.getInstance();

        amazon.setTextTop(textTop);
        amazon.setTextBottom(textBottom);




    }










}
