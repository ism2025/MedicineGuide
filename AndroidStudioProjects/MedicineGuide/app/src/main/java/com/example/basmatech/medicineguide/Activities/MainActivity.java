package com.example.basmatech.medicineguide.Activities;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.basmatech.medicineguide.Control.SystemControl;
import com.example.basmatech.medicineguide.ListActivities.AccordingToDepartmentActivity;
import com.example.basmatech.medicineguide.ListActivities.AccordingToGroupActivity;
import com.example.basmatech.medicineguide.R;
import com.example.basmatech.medicineguide.Utils.GroupsUtils;
import com.example.basmatech.medicineguide.model.Department;
import com.example.basmatech.medicineguide.model.Group;
import com.example.basmatech.medicineguide.model.MedicineItem;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    Button group_btn, departmen_tbtn;
    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GroupsUtils groupsUtils = new GroupsUtils(this);
//        groupsUtils.getGroups();
//        groupsUtils.getDepartments();
//        groupsUtils.getMedicines();
        GroupsUtils.GenerateData();


        group_btn = findViewById(R.id.group_btn);
        group_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AccordingToGroupActivity.class);
                startActivity(intent);
            }
        });

        departmen_tbtn =findViewById(R.id.department_btn);
        departmen_tbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AccordingToDepartmentActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        CountDownTimer timer = new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                count = 1;
            }
        };
        if (count == 1) {
            Toast.makeText(this, "إضفط مرة أخرى للخروج", Toast.LENGTH_SHORT).show();
            timer.start();
            count++;
        } else {
            super.onBackPressed();
            timer.cancel();
        }

    }
}
