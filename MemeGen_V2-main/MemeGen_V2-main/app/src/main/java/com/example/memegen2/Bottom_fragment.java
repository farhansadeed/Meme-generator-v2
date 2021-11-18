package com.example.memegen2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


public class Bottom_fragment extends Fragment {



    public static TextView memeTopText;
    public static TextView memeBottomText;
    public GlobalClass amazon;




    @Nullable
    @Override
    public View onCreateView (@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        amazon = GlobalClass.getInstance();

        View view = inflater.inflate(R.layout.bottom_fragment,container,false);
        memeTopText = (TextView)view.findViewById(R.id.memeTopText);
        memeBottomText = (TextView)view.findViewById(R.id.memeBottomText);
        memeTopText.setText(amazon.getTextTop());
        memeBottomText.setText(amazon.getTextBottom());






        return view;

    }

}
