package com.example.ttonwutichai.farmer;

import android.app.DatePickerDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Calendar;


public class CreateprojectFragment extends Fragment implements View.OnClickListener {

    RadioGroup radioGroup;
    LinearLayout lnlHide;
    Button btnNextinputproject;

    public static CreateprojectFragment newInstance() {
        CreateprojectFragment fragment = new CreateprojectFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_createproject, container, false);
        initInstances(rootView, savedInstanceState);
        return rootView;
    }

    private void initInstances(View rootView, Bundle savedInstanceState) {

        btnNextinputproject =(Button)rootView.findViewById(R.id.btnNextinputproject);
        btnNextinputproject.setOnClickListener(this);
        lnlHide =(LinearLayout)rootView.findViewById(R.id.lnlHide);
        lnlHide.setVisibility(View.GONE);
        radioGroup = (RadioGroup)rootView.findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rdbSolo) lnlHide.setVisibility(View.GONE);
                else lnlHide.setVisibility(View.VISIBLE);
            }
        });

    }

    @Override
    public void onClick(View v) {
        if(btnNextinputproject==v){
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,Createproject2Fragment.newInstance()).commit();
        }
    }
}

