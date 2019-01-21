package com.example.ttonwutichai.farmer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class PlanFragment extends Fragment implements View.OnClickListener {
    ImageButton imblistplan,imbCreatactivity;
    public static PlanFragment newInstance() {
        PlanFragment fragment = new PlanFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_plan, container, false);
        initInstances(rootView, savedInstanceState);
        return rootView;
    }

    private void initInstances(View rootView, Bundle savedInstanceState) {
        imblistplan = (ImageButton) rootView.findViewById(R.id.imblistplan);
        imbCreatactivity = (ImageButton) rootView.findViewById(R.id.imbCreatactivity);
        imblistplan.setOnClickListener(this);
        imbCreatactivity.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (imblistplan==v)
        {
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,PlanlistFragment.newInstance()).commit();
        }
        else if (imbCreatactivity==v)
        {
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,ListactivitiesFragment.newInstance()).commit();
        }
    }
}
