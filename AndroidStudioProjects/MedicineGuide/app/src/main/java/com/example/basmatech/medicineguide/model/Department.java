package com.example.basmatech.medicineguide.model;

import com.example.basmatech.medicineguide.Control.SystemControl;

import java.io.Serializable;
import java.util.ArrayList;

public class Department implements Serializable {
    private int id;
    private String name;
    private ArrayList<MedicineItem> DepartmentItems;
    private ArrayList<String> DepartmentItemsNames;
    static int count = 1;

    public Department(String name) {
        this.setId(count++);
        this.name = name;
        DepartmentItems = new ArrayList<>();
        DepartmentItemsNames = new ArrayList<>();
        SystemControl.Departments.add(this);
        SystemControl.DepartmentNames.add(this.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<MedicineItem> getDepartmentItems() {
        return DepartmentItems;
    }

    public void setDepartmentItems(MedicineItem MedicineItem) {
        this.DepartmentItems.add(MedicineItem);
    }

    public ArrayList<String> getDepartmentItemsNames() {
        return DepartmentItemsNames;
    }

    public void setDepartmentItemsNames(ArrayList<String> departmentItemsNames) {
        DepartmentItemsNames = departmentItemsNames;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
