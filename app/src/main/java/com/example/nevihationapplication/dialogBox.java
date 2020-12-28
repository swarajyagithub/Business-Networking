package com.example.nevihationapplication;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class dialogBox extends AppCompatDialogFragment {
    private TextView txenq;
    private EditText enqry;
    private TextView txtN;
    private TextView txtM;
    private TextView txtE;
    private EditText edtN;
    private EditText edtM;
    private EditText edtE;
    private EditText edtEx;
    private ExampleDailogListner listner;




    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        LayoutInflater layoutInflater=getActivity().getLayoutInflater();
        View view=layoutInflater.inflate(R.layout.layout_dailogbox,null);
        builder.setView(view).setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).setPositiveButton("send enquiry", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String enq=enqry.getText().toString();
                String name=edtN.getText().toString();
                int mobile=Integer.parseInt(edtM.getText().toString());
                String mail=edtE.getText().toString();
                listner.applyText(enq,name,mobile,mail);

            }
        });
        txenq=view.findViewById(R.id.textEnquiry);
        enqry=view.findViewById(R.id.edtenq);
        txtN=view.findViewById(R.id.tName);
        txtM=view.findViewById(R.id.txtMobile);
        txtE=view.findViewById(R.id.id);
        edtN=view.findViewById(R.id.edtName);
        edtM=view.findViewById(R.id.edtmbl);
        edtE=view.findViewById(R.id.edtId);
        edtEx=view.findViewById(R.id.Ex);
        return builder.create();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            listner=(ExampleDailogListner) context;
        } catch (ClassCastException e) {
           throw new ClassCastException(context.toString()+"Must implement ExampleDiaologListner");
        }
    }

    public interface ExampleDailogListner{
        void applyText(String Enquiry, String Name, int Mobile, String email );
    }
}
