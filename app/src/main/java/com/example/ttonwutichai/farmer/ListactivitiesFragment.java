package com.example.ttonwutichai.farmer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ListactivitiesFragment extends Fragment implements View.OnClickListener {

    Button btnActivity;
    public static ListactivitiesFragment newInstance() {
        ListactivitiesFragment fragment = new ListactivitiesFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_listactivities, container, false);
        initInstances(rootView,savedInstanceState);
        return rootView;
    }

    private void initInstances(View rootView, Bundle savedInstanceState) {
        btnActivity = (Button)rootView.findViewById(R.id.btnActivity);
        btnActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (btnActivity==v){
            ((HomeActivity) getActivity()).getSupportActionBar().setTitle("สร้างกิจกรรมการปลูก");
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,CreatactivityFragment.newInstance()).commit();
        }
    }
}
