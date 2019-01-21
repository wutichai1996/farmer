package com.example.ttonwutichai.farmer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;


public class AddproductfactorFragment extends Fragment {

    Spinner spnAddfactor;
    
    public static AddproductfactorFragment newInstance() {
        AddproductfactorFragment fragment = new AddproductfactorFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_addproductfactor, container, false);
        initInstances(rootView,savedInstanceState);
        return rootView;
    }

    private void initInstances(View rootView, Bundle savedInstanceState) {
        spnAddfactor = (Spinner)rootView.findViewById(R.id.spnType);
        String[] typeText = getResources().getStringArray(R.array.Type);
        ArrayAdapter<String> adp = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_dropdown_item_1line,typeText);
        spnAddfactor.setAdapter(adp);
    }


}
