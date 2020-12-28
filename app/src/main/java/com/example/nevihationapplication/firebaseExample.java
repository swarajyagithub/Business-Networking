package com.example.nevihationapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class firebaseExample extends AppCompatActivity {
    EditText n1;
    EditText n2;
    Button bt;
    private FirebaseAuth authf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase_example);

        n1=findViewById(R.id.email);
        n2=findViewById(R.id.pass);
        bt=findViewById(R.id.sign);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                authf=FirebaseAuth.getInstance();



String e=n1.getText().toString();
                String p=n2.getEditableText().toString();
                authf.createUserWithEmailAndPassword(e,p).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(getApplicationContext(),"Data Inserted",Toast.LENGTH_LONG).show();
                        }
                        else {
                            Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_LONG).show();
                        }

                    }
                });
            }
        });



    }


}
