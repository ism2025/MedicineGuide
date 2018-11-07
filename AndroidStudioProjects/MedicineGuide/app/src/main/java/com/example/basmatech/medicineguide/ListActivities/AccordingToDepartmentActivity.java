package com.example.basmatech.medicineguide.ListActivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.basmatech.medicineguide.Control.SystemControl;
import com.example.basmatech.medicineguide.R;
import com.example.basmatech.medicineguide.model.Department;
import com.example.basmatech.medicineguide.model.Group;

public class AccordingToDepartmentActivity extends AppCompatActivity {

    ListView depatrment_lv;
    Department tmp;
    Intent intent;
    ArrayAdapter<String> departmentAdapter;
    String selectedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_according_to_department);
        depatrment_lv = findViewById(R.id.depatrment_lv);
        departmentAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, SystemControl.DepartmentNames);
        depatrment_lv.setAdapter(departmentAdapter);

        depatrment_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tmp = SystemControl.getDepartment(position + 1);
                intent = new Intent(AccordingToDepartmentActivity.this, MedicinesListActivity.class);
                intent.putExtra("selectedDepartment", tmp);
                startActivity(intent);
            }
        });
    }
}
