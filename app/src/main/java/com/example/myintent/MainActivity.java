package com.example.myintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnl;
    Button btnsrc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnl=findViewById(R.id.btnl);
        btnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("telp 081316949793"));
                startActivity(i);
            }
        });
        btnsrc=findViewById(R.id.btnsrc);
        btnsrc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View r) {
                String url = "www.google.com";
                Intent v=new Intent(Intent.ACTION_VIEW);
                v.setData(Uri.parse(url));
                startActivity(v);
            }
        });
    }
}
