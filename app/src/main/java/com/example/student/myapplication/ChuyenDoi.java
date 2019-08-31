package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ChuyenDoi extends AppCompatActivity {

    EditText tenF,tenC;
    Button doiF,doiC,Clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuyen_doi);
        tenF=findViewById(R.id.editText_F);
        tenC=findViewById(R.id.editText_C);
        doiC=findViewById(R.id.button_doiC);
        doiF=findViewById(R.id.button_doiF);
        Clear=findViewById(R.id.button_Xoatrang);
        doiC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float c=Float.parseFloat(tenC.getText().toString());
                Doi doi=new Doi();
                tenF.setText(""+doi.doiCF());
            }
        });
        doiF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float f=Float.parseFloat(tenF.getText().toString());
                Doi doi=new Doi();
                tenC.setText(""+doi.doiFC());
            }
        });
        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tenC.setText("");
                tenF.setText("");
            }
        });
    }
}
