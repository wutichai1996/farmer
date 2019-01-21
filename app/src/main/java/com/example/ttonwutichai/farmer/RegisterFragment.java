package com.example.ttonwutichai.farmer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class RegisterFragment extends Fragment implements View.OnClickListener{

    Button btnConfirm;
    EditText edtFirstname,edtLastname,edtId,edtHome,edtPhonnumber,edtEmail,edtUsername,edtPassword,edtConfirmPassword;

    // TODO: Rename and change types and number of parameters
    public static RegisterFragment newInstance() {
        RegisterFragment fragment = new RegisterFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_register, container, false);
        init(rootView,savedInstanceState);

        return rootView;
    }

    private void init(View rootView, Bundle savedInstanceState) {
        btnConfirm = (Button)rootView.findViewById(R.id.btnConfirm);
        edtFirstname = (EditText)rootView.findViewById(R.id.edtFirstname);
        edtLastname = (EditText)rootView.findViewById(R.id.edtLastname);
        edtHome = (EditText)rootView.findViewById(R.id.edtHome);
        edtId = (EditText)rootView.findViewById(R.id.edtId);
        edtPhonnumber = (EditText)rootView.findViewById(R.id.edtPhonnumber);
        edtEmail = (EditText)rootView.findViewById(R.id.edtEmail);
        edtUsername = (EditText)rootView.findViewById(R.id.edtUsername);
        edtPassword = (EditText)rootView.findViewById(R.id.edtPassword);
        edtConfirmPassword = (EditText)rootView.findViewById(R.id.edtConfirmPassword);



        clickButton();
    }

    private void clickButton() {
        btnConfirm.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==btnConfirm) {
            if (edtPassword.getText().toString().equals(edtConfirmPassword.getText().toString()))
                Toast.makeText(getContext(), "รหัสผ่านตรงกัน", Toast.LENGTH_SHORT).show();
            else Toast.makeText(getContext(), "รหัสผ่านไม่ตรงกัน", Toast.LENGTH_SHORT).show();
        }
    }

}
