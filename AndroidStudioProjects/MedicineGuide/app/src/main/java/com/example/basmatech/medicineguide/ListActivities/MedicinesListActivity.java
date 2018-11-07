package com.example.basmatech.medicineguide.ListActivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.basmatech.medicineguide.Activities.MedicineActivity;
import com.example.basmatech.medicineguide.Control.SystemControl;
import com.example.basmatech.medicineguide.R;
import com.example.basmatech.medicineguide.model.Department;
import com.example.basmatech.medicineguide.model.Group;
import com.example.basmatech.medicineguide.model.MedicineItem;

import java.util.ArrayList;

public class MedicinesListActivity extends AppCompatActivity {

    ListView medicins_lv;
    Group medicineGroup;
    Department medicineDepartment;
    MedicineItem tmp;
    String selectedMedicine;
    Intent medicineIntent, recivedIntent;
    private ArrayAdapter<String> medicinesAdapter;
    ArrayList<String> medicineItemNames;
    ArrayList<String> searchResult = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_list);
        medicins_lv = findViewById(R.id.medicins_lv);

        medicineIntent = new Intent(MedicinesListActivity.this, MedicineActivity.class);

        recivedIntent = getIntent();
        if (recivedIntent.hasExtra("selectedGroup")) {

            medicineGroup = (Group) recivedIntent.getSerializableExtra("selectedGroup");
            medicineItemNames = medicineGroup.getGroupMedicineItemsNames();

            medicinesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, medicineItemNames);
            medicins_lv.setAdapter(medicinesAdapter);

            medicins_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if (searchResult.size() == 0) {
                        selectedMedicine = medicineItemNames.get(position);
                    } else {
                        selectedMedicine = searchResult.get(position);
                    }
                    tmp = SystemControl.getMedicineByGroup(medicineGroup.getName(), selectedMedicine);
                    medicineIntent.putExtra("selectedMedicine", tmp);
                    startActivity(medicineIntent);

                }
            });
        } else if (recivedIntent.hasExtra("selectedDepartment")) {

            medicineDepartment = (Department) recivedIntent.getSerializableExtra("selectedDepartment");
            medicineItemNames = medicineDepartment.getDepartmentItemsNames();

            medicinesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, medicineItemNames);
            medicins_lv.setAdapter(medicinesAdapter);

            medicins_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if (searchResult.size() == 0) {
                        selectedMedicine = medicineItemNames.get(position);
                    } else {
                        selectedMedicine = searchResult.get(position);
                    }
                    for (String mm : medicineItemNames) {
                        if (mm.equals(selectedMedicine)) {
                            tmp = SystemControl.getMedicineByDepartment(medicineDepartment.getName(), selectedMedicine);
                            medicineIntent.putExtra("selectedMedicine", tmp);
                            if (tmp != null) {
                                startActivity(medicineIntent);
                                break;
                            }

                        }
                    }
                    //                    tmp = SystemControl.getMedicineByDepartment(medicineDepartment.getName(), selectedMedicine);
                }
            });
        }
    }


    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        MenuItem ourSearchItem = menu.findItem(R.id.action_search);

        final ArrayList<String> savedItem = new ArrayList<>(medicineItemNames);

        SearchView sv = (SearchView) ourSearchItem.getActionView();
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                searchResult.clear();
                if (newText.length() != 0) {
                    for (String m : medicineItemNames) {
                        if (m.contains(newText)) {
                            searchResult.add(m);
                        }
                    }
                    medicinesAdapter.clear();
                    medicinesAdapter.addAll(searchResult);
                    medicinesAdapter.notifyDataSetChanged();
                } else {
                    searchResult.clear();
                    medicinesAdapter.clear();
                    medicineItemNames = savedItem;
                    medicinesAdapter.addAll(medicineItemNames);
                    medicinesAdapter.notifyDataSetChanged();
                }
                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_search) {
            SearchView searchView = (SearchView) item;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
