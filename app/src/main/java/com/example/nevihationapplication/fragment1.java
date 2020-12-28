package com.example.nevihationapplication;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class fragment1 extends Fragment {
    GridView gridViewS;
    AdapterF adapterF;
    singleDatabase db;

    ArrayList<String> namF=new ArrayList<String>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vroot=inflater.inflate(R.layout.fragment1,null);
      //  gridViewS=vroot.findViewById(R.id.gridVEn);
        db=new singleDatabase(getActivity());
        Cursor subEn=db.getDataEnquiry();
        while (subEn.moveToNext()) {
            String subName=subEn.getString(2);

            namF.add(subName);

        }
        List<ItemModelF> itemModelFList=new ArrayList<>();
        for(int i=0;i<namF.size();i++)
        {
            ItemModelF itemModelF=new ItemModelF(namF.get(i));
            itemModelFList.add(itemModelF);

        }
        adapterF= new AdapterF(itemModelFList,getActivity());
        gridViewS.setAdapter(adapterF);
        return vroot;
    }
    public class AdapterF extends BaseAdapter{

        private List<ItemModelF> itemModelFList;
        private  List<ItemModelF> itemFFilter;
        private Context context;

        public AdapterF(List<ItemModelF> itemModelFList, Context context) {
            this.itemModelFList = itemModelFList;
            this.itemFFilter=itemModelFList;
            this.context = context;
        }

        @Override
        public int getCount() {
            return itemFFilter.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view=getLayoutInflater().inflate(R.layout.enquiry_item,null);
            TextView textView1=view.findViewById(R.id.edt);
            Button bt=view.findViewById(R.id.edtb);
            //bt.setText("View Equiry");
            textView1.setText(itemFFilter.get(position).getNameF());

            return view;
        }
    }
}
