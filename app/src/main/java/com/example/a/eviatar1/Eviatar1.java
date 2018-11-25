package com.example.a.eviatar1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Eviatar1 extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eviatar1);
        btn=(Button) findViewById(R.id.btn);
    }

    public void click(View view) {
        btn.setText("OH YEAH IVE BEEN CLICKED!");
    }
}
