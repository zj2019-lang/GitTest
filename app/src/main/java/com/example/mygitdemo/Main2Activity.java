package com.example.mygitdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listViewLeft2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        listViewLeft2 = (ListView) findViewById(R.id.listView_left2);
        listViewLeft2.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                startActivity(new Intent(Main2Activity.this,MainActivity.class));
                break;
            case 1:
                startActivity(new Intent(Main2Activity.this,Main2Activity.class));
                break;


        }

    }
}
