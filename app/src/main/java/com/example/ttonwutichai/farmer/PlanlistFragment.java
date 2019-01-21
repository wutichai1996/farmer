package com.example.ttonwutichai.farmer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class PlanlistFragment extends Fragment implements View.OnClickListener {

    Button btnAddPlan;
    public static PlanlistFragment newInstance() {
        PlanlistFragment fragment = new PlanlistFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_planlist, container, false);
        initInstances(rootView, savedInstanceState);
        return rootView;
    }

    private void initInstances(View rootView, Bundle savedInstanceState) {
        btnAddPlan = (Button)rootView.findViewById(R.id.btnPlan);
        btnAddPlan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (btnAddPlan==v){
            ((HomeActivity) getActivity()).getSupportActionBar().setTitle("สร้างแผนการปลูก");
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,CreatlistplanFragment.newInstance()).commit();
        }
    }
}
