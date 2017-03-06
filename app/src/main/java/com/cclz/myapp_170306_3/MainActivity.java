package com.cclz.myapp_170306_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener{
    Spinner spr, spr2;
    String[] strs={"AA", "BBB", "CCCC", "DD", "EEEEE"};
    Button btn1,btn2;
    TextView tv1,tv2,tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button) findViewById(R.id.button);
        btn2=(Button) findViewById(R.id.button2);
        tv1=(TextView)findViewById(R.id.textView2);
        tv2=(TextView)findViewById(R.id.textView3);
        tv3=(TextView)findViewById(R.id.textView4);
        spr=(Spinner) findViewById(R.id.spinner);
        spr2=(Spinner) findViewById(R.id.spinner2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

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

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,strs);
        spr2.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                tv2.setText(tv1.getText());
                break;

            case R.id.button2:
            int poi=spr.getSelectedItemPosition();
                String[] f=getResources().getStringArray(R.array.fruits);
                tv3.setText(f[poi]);
                break;
        }
    }
}
