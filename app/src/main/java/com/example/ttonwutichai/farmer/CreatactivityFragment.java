package com.example.ttonwutichai.farmer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class CreatactivityFragment extends Fragment implements View.OnClickListener {

    Button btnHide;
    LinearLayout lnlHide;

    public static CreatactivityFragment newInstance() {
        CreatactivityFragment fragment = new CreatactivityFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_creatactivity, container, false);
        initInstances(rootView,savedInstanceState);
        return rootView;
    }

    private void initInstances(View rootView, Bundle savedInstanceState) {

        btnHide = (Button)rootView.findViewById(R.id.btnHide);
        lnlHide = (LinearLayout)rootView.findViewById(R.id.lnlHide);
        lnlHide.setVisibility(View.GONE);
        btnHide.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if(v==btnHide){
            lnlHide.setVisibility(View.VISIBLE);
            btnHide.setVisibility(View.GONE);
        }
    }
}
