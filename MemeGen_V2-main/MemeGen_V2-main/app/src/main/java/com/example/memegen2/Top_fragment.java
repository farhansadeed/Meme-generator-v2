package com.example.memegen2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class Top_fragment extends Fragment {

    public static EditText textTop;
    public static EditText textBottom;


    topFragmentListener activityCommander;


    public  interface topFragmentListener{

        public void creatememe(String top, String bottom);
    }

    @Override
    public void onAttach(Context context)  {
        super.onAttach(context);
        try{
            activityCommander = (topFragmentListener) getActivity();
        }catch (ClassCastException e){
            throw new ClassCastException(getActivity().toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.top_fragment, container, false);

        textTop = (EditText) view.findViewById(R.id.textTop);
        textBottom = (EditText) view.findViewById(R.id.textBottom);
        final Button runButton = (Button) view.findViewById(R.id.runButton);

        runButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {



                        buttonClicked(view);







                    }
                }
        );



        return view;

    }

    public void buttonClicked(View view){

        activityCommander.creatememe(textTop.getText().toString(), textBottom.getText().toString());

        // implements Top_fragment.topFragmentListener{








    }
}
