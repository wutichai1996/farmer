package com.example.ttonwutichai.farmer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ProductqualityFragment extends Fragment implements View.OnClickListener {

    Button btnAddpquality;

    public static ProductqualityFragment newInstance() {
        ProductqualityFragment fragment = new ProductqualityFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_productquality, container, false);
        initInstances(rootView,savedInstanceState);
        return rootView;
    }

    private void initInstances(View rootView, Bundle savedInstanceState) {

        btnAddpquality =(Button)rootView.findViewById(R.id.btnAddpquality);
        btnAddpquality.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==btnAddpquality){
            ((HomeActivity) getActivity()).getSupportActionBar().setTitle("สร้างคุณภาพผลผลิต");
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,AddproductqualityFragment.newInstance()).commit();
        }
    }
}
