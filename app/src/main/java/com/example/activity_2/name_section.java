package com.example.activity_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class name_section extends AppCompatActivity {

    TextView title, description;
    String data1, data2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_section);

        title = findViewById(R.id.titleText);
        description = findViewById(R.id.description);

        getData();
        setData();
    }

    public void getData(){
        if(getIntent().hasExtra("data1") && getIntent().hasExtra("data2")){
            data1= getIntent().getStringExtra("data1");
            data2= getIntent().getStringExtra("data2");
        }else{
            Toast.makeText(this, "No Data.", Toast.LENGTH_SHORT).show();
        }
    }

    public void setData(){
        title.setText(data1);
        description.setText(data2);
    }
}