package com.example.ttonwutichai.farmer;

import android.app.DatePickerDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Calendar;


public class Createproject2Fragment extends Fragment implements View.OnClickListener {

    Button btnDate3, btnDate1, btnDate2, btnBackproject,btnAddfield;
    TextView tvDate3, tvDate1, tvDate2;
    LinearLayout lnlAddfield;

    Calendar c;
    DatePickerDialog dpd;

    public static Createproject2Fragment newInstance() {
        Createproject2Fragment fragment = new Createproject2Fragment();
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
        View rootView = inflater.inflate(R.layout.fragment_createproject2, container, false);
        initInstances(rootView, savedInstanceState);
        return rootView;
    }

    private void initInstances(View rootView, Bundle savedInstanceState) {

        tvDate3 = (TextView) rootView.findViewById(R.id.tvDate3);
        tvDate1 = (TextView) rootView.findViewById(R.id.tvDate1);
        tvDate2 = (TextView) rootView.findViewById(R.id.tvDate2);
        btnDate3 = (Button) rootView.findViewById(R.id.btnDate3);
        btnDate1 = (Button) rootView.findViewById(R.id.btnDate1);
        btnDate2 = (Button) rootView.findViewById(R.id.btnDate2);
        btnBackproject = (Button) rootView.findViewById(R.id.btnBackproject);

        btnAddfield = (Button)rootView.findViewById(R.id.btnAddfield);
        lnlAddfield = (LinearLayout)rootView.findViewById(R.id.lnlAddfield);

        btnDate3.setOnClickListener(this);
        btnDate1.setOnClickListener(this);
        btnDate2.setOnClickListener(this);
        btnBackproject.setOnClickListener(this);
        btnAddfield.setOnClickListener(this);

    }

    public void onAddField(View v){
        LayoutInflater inflater = (LayoutInflater)getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.add_field_createproject,null);


        Button btnDel = (Button)rowView.findViewById(R.id.btnDel);


        View.OnClickListener thisListener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                onDelete(v);
            }
        };

        btnDel.setOnClickListener(thisListener);
        lnlAddfield.addView(rowView,lnlAddfield.getChildCount());
    }

    public void onDelete(View v){
        lnlAddfield.removeView((View) v.getParent());
    }

    @Override
    public void onClick(View v) {
        c = Calendar.getInstance();
        int day = c.get(Calendar.DAY_OF_MONTH);
        int month = c.get(Calendar.MONTH);
        int year = c.get(Calendar.YEAR);

        if (v == btnDate3) {
            dpd = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    tvDate3.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
                }
            }, day, month, year);
            dpd.show();
        } else if (v == btnDate1) {
            dpd = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    tvDate1.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
                }
            }, day, month, year);
            dpd.show();
        } else if (v == btnDate2) {
            dpd = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    tvDate2.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
                }
            }, day, month, year);
            dpd.show();
        }else if (v==btnBackproject){
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contenContainer,CreateprojectFragment.newInstance()).commit();
        }else if(v==btnAddfield){
            onAddField(v);
        }
    }
}
