package com.example.chinmay.engineeringmanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by chinmay on 17/12/17.
 */

public class QuestionPapers extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_questionpapers,null);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.TOCDEC2016).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), webViewPDF.class);
                getActivity().startActivity(intent);

                Toast.makeText(getActivity(),"TOC DEC 2017",Toast.LENGTH_LONG).show();
            }

        });

    }
}

// Switching from fragment to activity...

/*
Intent intent = new Intent(getActivity(), SomeNewActivity.class);
getActivity().startActivity(intent);
 */