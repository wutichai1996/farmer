package com.example.ttonwutichai.farmer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class WarehouseFragment extends Fragment implements View.OnClickListener {

    ImageButton imbWaerhouse,imbAddwarehouse,imbManagewarehouse,imbDistribute;

    public static WarehouseFragment newInstance() {
        WarehouseFragment fragment = new WarehouseFragment();
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
        View rootView =  inflater.inflate(R.layout.fragment_warehouse, container, false);
        initInstances(rootView,savedInstanceState);
        return rootView;
    }

    private void initInstances(View rootView, Bundle savedInstanceState) {

        imbWaerhouse = (ImageButton)rootView.findViewById(R.id.imbWaerhouse);
        imbAddwarehouse = (ImageButton)rootView.findViewById(R.id.imbAddwarehouse);
        imbManagewarehouse = (ImageButton)rootView.findViewById(R.id.imbManagewarehouse);
        imbDistribute = (ImageButton)rootView.findViewById(R.id.imbDistribute);

        imbWaerhouse.setOnClickListener(this);
        imbAddwarehouse.setOnClickListener(this);
        imbManagewarehouse.setOnClickListener(this);
        imbDistribute.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if(v==imbWaerhouse){
            ((HomeActivity) getActivity()).getSupportActionBar().setTitle("คลังปัจจัยการผลิต");
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,InfowarehouseFragment.newInstance()).commit();
        }else if(v==imbAddwarehouse){
            ((HomeActivity) getActivity()).getSupportActionBar().setTitle("เพิ่มปัจจัยการผลิตในคลัง");
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,AddpdwareFragment.newInstance()).commit();
        }else if(v==imbManagewarehouse){
            ((HomeActivity) getActivity()).getSupportActionBar().setTitle("จัดการปัจจัยการผลิตในคลัง");
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,ManageFragment.newInstance()).commit();
        }else if(v==imbDistribute){
            ((HomeActivity) getActivity()).getSupportActionBar().setTitle("แจกจ่ายปัจจัยการผลิต");
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,ListProductwareFragment.newInstance()).commit();
        }
    }
}
