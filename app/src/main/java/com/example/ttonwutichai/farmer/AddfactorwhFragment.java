package com.example.ttonwutichai.farmer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class AddfactorwhFragment extends Fragment {

    RadioGroup radioGroup;
    LinearLayout lnlPaty;

    public static AddfactorwhFragment newInstance() {
        AddfactorwhFragment fragment = new AddfactorwhFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_addfactorwh, container, false);
        initInstances(rootView,savedInstanceState);
        return rootView;
    }

    private void initInstances(final View rootView, Bundle savedInstanceState) {

        radioGroup =(RadioGroup)rootView.findViewById(R.id.radioGroup);
        lnlPaty = (LinearLayout)rootView.findViewById(R.id.lnlPaty);
        lnlPaty.setVisibility(View.GONE);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rdbSolo){
                    lnlPaty.setVisibility(View.GONE);
                }else{
                    lnlPaty.setVisibility(View.VISIBLE);
                }

            }
        });

    }
}
