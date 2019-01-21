package com.example.ttonwutichai.farmer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

public class AddproductoutputFragment extends Fragment {

    RadioGroup radioGroup;
    LinearLayout lnlHide1;
   
    public static AddproductoutputFragment newInstance() {
        AddproductoutputFragment fragment = new AddproductoutputFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_addproductoutput, container, false);
        initInstances(rootView,savedInstanceState);
        return rootView;
    }

    private void initInstances(View rootView, Bundle savedInstanceState) {

        lnlHide1 =(LinearLayout)rootView.findViewById(R.id.lnlHide1);
        lnlHide1.setVisibility(View.GONE);

        radioGroup = (RadioGroup)rootView.findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rdbSolo){
                    lnlHide1.setVisibility(View.GONE);
                }else{
                    lnlHide1.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
