package com.example.basmatech.medicineguide.model;

import com.example.basmatech.medicineguide.Control.SystemControl;

import java.io.Serializable;
import java.util.ArrayList;

public class Group implements Serializable {
    private int id;
    private String name;
    private ArrayList<MedicineItem> GroupMedicineItems;
    private ArrayList<String> GroupMedicineItemsNames;
    static int count = 1;

    public Group(String name) {
        this.setId(count++);
        this.name = name;
        GroupMedicineItems = new ArrayList<>();
        GroupMedicineItemsNames = new ArrayList<>();
        SystemControl.Groups.add(this);
        SystemControl.GroupNames.add(this.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<MedicineItem> getGroupMedicineItems() {
        return GroupMedicineItems;
    }

    public void setGroupMedicineItems(MedicineItem MedicineItem) {
        this.GroupMedicineItems.add(MedicineItem);
    }

    public ArrayList<String> getGroupMedicineItemsNames() {
        return GroupMedicineItemsNames;
    }

    public void setGroupMedicineItemsNames(ArrayList<String> groupMedicineItemsNames) {
        GroupMedicineItemsNames = groupMedicineItemsNames;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
