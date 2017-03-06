package com.cclz.myapp_170306_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener{
    Spinner spr;
    Button btn;
    TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button) findViewById(R.id.button);
        tv1=(TextView)findViewById(R.id.textView2);
        tv2=(TextView)findViewById(R.id.textView3);
        spr=(Spinner) findViewById(R.id.spinner);
        btn.setOnClickListener(this);

        spr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] f=getResources().getStringArray(R.array.fruits);
                tv1.setText(f[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                tv2.setText(tv1.getText());
                break;
        }
    }
}
