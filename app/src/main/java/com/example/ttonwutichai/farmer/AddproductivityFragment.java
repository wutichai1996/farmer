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
import android.widget.RadioGroup;
import android.widget.TextView;

public class AddproductivityFragment extends Fragment implements View.OnClickListener {

    RadioGroup radioGroup;
    TextView tvText;
    LinearLayout lnlHide1,lnlHide2,lnlAddfield;
    Button btnAddfield;
    
    public static AddproductivityFragment newInstance() {
        AddproductivityFragment fragment = new AddproductivityFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_addproductivity, container, false);
        initInstances(rootView,savedInstanceState);
        return rootView;
    }

    private void initInstances(View rootView, Bundle savedInstanceState) {
        lnlAddfield = (LinearLayout)rootView.findViewById(R.id.lnlAddfreld);
        btnAddfield = (Button)rootView.findViewById(R.id.btnAddfield);

        btnAddfield.setOnClickListener(this);

        tvText = (TextView)rootView.findViewById(R.id.tvTexthead);
        lnlHide1 =(LinearLayout)rootView.findViewById(R.id.lnlHide1);
        lnlHide2 =(LinearLayout)rootView.findViewById(R.id.lnlHide2);
        lnlHide1.setVisibility(View.GONE);
        lnlHide2.setVisibility(View.GONE);

        radioGroup = (RadioGroup)rootView.findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rdbSolo){
                    tvText.setText("รายเดี่ยว");
                    lnlHide1.setVisibility(View.GONE);
                    lnlHide2.setVisibility(View.GONE);
                }else{
                    tvText.setText("กลุ่มเครือข่าย");
                    lnlHide1.setVisibility(View.VISIBLE);
                    lnlHide2.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    public void onAddField(View v){
        LayoutInflater inflater = (LayoutInflater)getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.add_field_waerhouse1,null);


        Button btnDelplant = (Button)rowView.findViewById(R.id.btnDelplant);


        View.OnClickListener thisListener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                onDelete(v);
            }
        };

        btnDelplant.setOnClickListener(thisListener);
        lnlAddfield.addView(rowView,lnlAddfield.getChildCount());
    }

    public void onDelete(View v){
        lnlAddfield.removeView((View) v.getParent());
    }

    @Override
    public void onClick(View v) {
        if(v==btnAddfield){
            onAddField(v);
        }
    }
}
