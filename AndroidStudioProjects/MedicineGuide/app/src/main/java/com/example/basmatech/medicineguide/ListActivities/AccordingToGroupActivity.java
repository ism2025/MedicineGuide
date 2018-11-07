package com.example.basmatech.medicineguide.ListActivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.basmatech.medicineguide.R;
import com.example.basmatech.medicineguide.Control.SystemControl;
import com.example.basmatech.medicineguide.model.Group;

public class AccordingToGroupActivity extends AppCompatActivity {

    ListView group_lv;
    ArrayAdapter<String> groupAdapter;
    Group tmp;
    Intent intent;
    String selectedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_according_togroup);


        group_lv = findViewById(R.id.group_lv);
        groupAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, SystemControl.GroupNames);
        group_lv.setAdapter(groupAdapter);

        group_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tmp = SystemControl.getGroup(position + 1);
                intent = new Intent(AccordingToGroupActivity.this, MedicinesListActivity.class);
                intent.putExtra("selectedGroup", tmp);
                startActivity(intent);
            }
        });

    }


}
