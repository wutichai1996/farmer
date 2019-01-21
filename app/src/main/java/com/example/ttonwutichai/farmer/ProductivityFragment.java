package com.example.ttonwutichai.farmer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class ProductivityFragment extends Fragment implements View.OnClickListener {

    ImageButton imbProductqualitylist,imbProductoutput,imbHarvestlist;
   
    public static ProductivityFragment newInstance() {
        ProductivityFragment fragment = new ProductivityFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_productivity, container, false);
        initInstances(rootView,savedInstanceState);
        return rootView;
    }

    private void initInstances(View rootView, Bundle savedInstanceState) {

        imbProductqualitylist = (ImageButton)rootView.findViewById(R.id.imbProductqualitylist);
        imbProductoutput = (ImageButton)rootView.findViewById(R.id.imbProductoutput);
        imbHarvestlist = (ImageButton)rootView.findViewById(R.id.imbHarvestlist);
        imbProductqualitylist.setOnClickListener(this);
        imbProductoutput.setOnClickListener(this);
        imbHarvestlist.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==imbProductqualitylist){
            ((HomeActivity) getActivity()).getSupportActionBar().setTitle("คลังผลผลิต");
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,ProductivitylistFragment.newInstance()).commit();
        }else if(v==imbProductoutput){
            ((HomeActivity) getActivity()).getSupportActionBar().setTitle("จัดการผลผลิต");
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,ManageproductivityFragment.newInstance()).commit();
        }else if(v==imbHarvestlist){
            ((HomeActivity) getActivity()).getSupportActionBar().setTitle("รายการเก็บเกี่ยว");
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,HarvestlistFragment.newInstance()).commit();
        }
    }
}
