package com.example.ttonwutichai.farmer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class ProducfactorFragment extends Fragment implements View.OnClickListener {

    ImageButton imbAddPdf,imbTypeFertilizer,imbFood;

    public static ProducfactorFragment newInstance() {
        ProducfactorFragment fragment = new ProducfactorFragment();
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
        View rootView =  inflater.inflate(R.layout.fragment_producfactor, container, false);
        initInstances(rootView,savedInstanceState);
        return rootView;
    }

    private void initInstances(View rootView, Bundle savedInstanceState) {
        imbAddPdf = (ImageButton)rootView.findViewById(R.id.imbAddPdf);
        imbTypeFertilizer = (ImageButton)rootView.findViewById(R.id.imbTypeFertilizer);
        imbFood = (ImageButton)rootView.findViewById(R.id.imbFood);


        imbAddPdf.setOnClickListener(this);
        imbTypeFertilizer.setOnClickListener(this);
        imbFood.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==imbAddPdf){
            ((HomeActivity) getActivity()).getSupportActionBar().setTitle("เพิ่มปัจจัยการผลิต");
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,AddpdwareFragment.newInstance()).commit();
        }else if(v==imbTypeFertilizer){
            ((HomeActivity) getActivity()).getSupportActionBar().setTitle("ปุ๋ย");
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,ListpdstFragment.newInstance()).commit();
        }else if(v==imbFood){
            ((HomeActivity) getActivity()).getSupportActionBar().setTitle("รายละเอียด");
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,VieweritempdfFragment.newInstance()).commit();
        }
    }
}
