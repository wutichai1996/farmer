package com.example.ttonwutichai.farmer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class PlantinglistFragment extends Fragment implements View.OnClickListener {

    Button btnAddPlant;

    public static PlantinglistFragment newInstance() {
        PlantinglistFragment fragment = new PlantinglistFragment();
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
        View rootView =  inflater.inflate(R.layout.fragment_plantinglist, container, false);
        initInstances(rootView,savedInstanceState);
        return rootView;
    }

    private void initInstances(View rootView, Bundle savedInstanceState) {
        btnAddPlant = (Button)rootView.findViewById(R.id.btnAddPlant);
        btnAddPlant.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==btnAddPlant){
            ((HomeActivity) getActivity()).getSupportActionBar().setTitle("เพิ่มแปลงปลูก");
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,AddplantFragment.newInstance()).commit();
        }
    }
}
