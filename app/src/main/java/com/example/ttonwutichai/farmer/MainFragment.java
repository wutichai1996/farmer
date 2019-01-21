package com.example.ttonwutichai.farmer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainFragment extends Fragment implements View.OnClickListener {

    ImageButton imbPlant,imbProductfactor, imbFactorhouse,imbProductquality,imbProductivity,imbProjectlist,imbPlan,imbReport;

    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*if (getArguments() != null) {

        }*/

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_main, container, false);
        initInstances(rootView,savedInstanceState);
        return rootView;
    }

    private void initInstances(View rootView, Bundle savedInstanceState) {
        imbPlant = (ImageButton)rootView.findViewById(R.id.imbPlant);
        imbProductfactor =(ImageButton)rootView.findViewById(R.id.imbProductfactor);
        imbFactorhouse =(ImageButton)rootView.findViewById(R.id.imbFactorhouse);
        imbProductquality =(ImageButton)rootView.findViewById(R.id.imbProductquality);
        imbProductivity =(ImageButton)rootView.findViewById(R.id.imbProductivity);
        imbProjectlist =(ImageButton)rootView.findViewById(R.id.imbProjectlist);
        imbPlan =(ImageButton)rootView.findViewById(R.id.imbPlan);
        imbReport =(ImageButton)rootView.findViewById(R.id.imbReport);
        imbPlant.setOnClickListener(this);
        imbProductfactor.setOnClickListener(this);
        imbFactorhouse.setOnClickListener(this);
        imbProductquality.setOnClickListener(this);
        imbProductivity.setOnClickListener(this);
        imbProjectlist.setOnClickListener(this);
        imbPlan.setOnClickListener(this);
        imbReport.setOnClickListener(this);

    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onClick(View v) {
        if(v==imbPlant){
            ((HomeActivity) getActivity()).getSupportActionBar().setTitle("แปลงปลูก");
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,PlantinglistFragment.newInstance()).commit();
        }else if(v==imbProductfactor){
            ((HomeActivity) getActivity()).getSupportActionBar().setTitle("ปัจจัยการผลิต");
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,ProducfactorFragment.newInstance()).commit();
        }else if(v==imbFactorhouse){
            ((HomeActivity) getActivity()).getSupportActionBar().setTitle("คลังปัจจัยการผลิต");
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,WarehouseFragment.newInstance()).commit();
        }else if(v==imbProductquality){
            ((HomeActivity) getActivity()).getSupportActionBar().setTitle("คุณภาพผลผลิต");
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,ProductqualityFragment.newInstance()).commit();
        }else if(v==imbProductivity){
            ((HomeActivity) getActivity()).getSupportActionBar().setTitle("คลังผลผลิต");
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,ProductivityFragment.newInstance()).commit();
        }else if(v==imbProjectlist){
            ((HomeActivity) getActivity()).getSupportActionBar().setTitle("รายการโครงการ");
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,ProjectlistFragment.newInstance()).commit();
        }else if(v==imbPlan){
            ((HomeActivity) getActivity()).getSupportActionBar().setTitle("แผนการปลูก");
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,PlanFragment.newInstance()).commit();
        }else if(v==imbReport){
            ((HomeActivity) getActivity()).getSupportActionBar().setTitle("รายงาน");
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,ReportFragment.newInstance()).commit();
        }

    }
}
