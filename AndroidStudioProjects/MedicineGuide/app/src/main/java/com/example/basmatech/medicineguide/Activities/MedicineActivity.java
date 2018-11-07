package com.example.basmatech.medicineguide.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.basmatech.medicineguide.Control.SystemControl;
import com.example.basmatech.medicineguide.R;
import com.example.basmatech.medicineguide.model.MedicineItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class MedicineActivity extends AppCompatActivity {

    TextView mName_tv, gName_tv, dName_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine);
        mName_tv = findViewById(R.id.mName_tv);

        test();
        if (getIntent() != null && getIntent().hasExtra("selectedMedicine")) {
            Intent medicineIntent = getIntent();
            MedicineItem selectedMedicine = (MedicineItem) medicineIntent.getSerializableExtra("selectedMedicine");
            mName_tv.setText(selectedMedicine.getMedicineName());
        }


    }

    public void test() {
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("Test 1", 4);
//        map.put("Test 2", 4);
//        map.put("Test 3", 4);
//        map.put("Test 4", 4);
//        map.put("Test 5", 4);
//        map.put("Test 6", 4);
//        map.put("Test 7", 4);
//
//        Object[] ss = map.keySet().toArray();
//        String[] sss = new String[ss.length];
//        for (int i = 0; i < ss.length; i++) {
//            sss[i] = ss[i].toString();
//        }
//
//        ArrayAdapter<String> d = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sss);
//
//        spinnerTv.setAdapter(d);
    }
}
