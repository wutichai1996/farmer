package com.example.ttonwutichai.farmer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class AddproductqualityFragment extends Fragment implements View.OnClickListener {

    LinearLayout lnlAddfreld;
    Button btnAddfield;
    
    public static AddproductqualityFragment newInstance() {
        AddproductqualityFragment fragment = new AddproductqualityFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_addproductquality, container, false);
        initInstances(rootView,savedInstanceState);
        return rootView;
    }

    private void initInstances(View rootView, Bundle savedInstanceState) {

        btnAddfield = (Button)rootView.findViewById(R.id.btnAddfield);
        lnlAddfreld = (LinearLayout)rootView.findViewById(R.id.lnlAddfreld);
        btnAddfield.setOnClickListener(this);

    }

    public void onAddField(View v){
        LayoutInflater inflater = (LayoutInflater)getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.add_field_productquality,null);


        Button btnDel = (Button)rowView.findViewById(R.id.btnDel);


        View.OnClickListener thisListener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                onDelete(v);
            }
        };

        btnDel.setOnClickListener(thisListener);
        lnlAddfreld.addView(rowView,lnlAddfreld.getChildCount());
    }

    public void onDelete(View v){
        lnlAddfreld.removeView((View) v.getParent());
    }

    @Override
    public void onClick(View v) {
        if(v==btnAddfield){
            onAddField(v);
        }
    }
}
