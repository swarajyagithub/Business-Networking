package com.example.nevihationapplication;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class fragmentExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_example);
    }
   public void changefragment(View view)
    {
        Fragment fragment;
        if(view==findViewById(R.id.B1)){
           fragment=new frog1();
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.frag1,fragment);
            ft.commit();
        }
        if(view==findViewById(R.id.B2)){
           fragment=new frog2();
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.frag1,fragment);
            ft.commit();
        }


    }
}
