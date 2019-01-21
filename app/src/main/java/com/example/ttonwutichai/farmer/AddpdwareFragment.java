package com.example.ttonwutichai.farmer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class AddpdwareFragment extends Fragment implements View.OnClickListener {

    Button btnAddpdware;
    
    public static AddpdwareFragment newInstance() {
        AddpdwareFragment fragment = new AddpdwareFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_addpdware, container, false);
        initInstances(rootView, savedInstanceState);
        return rootView;
    }

    private void initInstances(View rootView, Bundle savedInstanceState) {

        btnAddpdware = (Button)rootView.findViewById(R.id.btnAddpdware);
        btnAddpdware.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (btnAddpdware==v){
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,AddfactorwhFragment.newInstance()).commit();
        }
    }
}
