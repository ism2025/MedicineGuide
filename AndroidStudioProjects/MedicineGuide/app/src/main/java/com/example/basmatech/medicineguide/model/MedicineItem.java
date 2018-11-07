package com.example.basmatech.medicineguide.model;

import com.example.basmatech.medicineguide.Control.SystemControl;

import java.io.Serializable;

public class MedicineItem implements Serializable {
    private int id;
    private String MedicineName;
    private String about;
    private String uses;
    private String sideEffect;
    private String dose;
    private Group medicinesGroup;
    Department medicineDepartment;

    static int count = 1;


    public MedicineItem(String medicineName, String about, int medicinesGroupId, int medicineDepartmentId) {
        this.setId(count);
        this.setMedicineName(medicineName);
        this.setAbout(about);

        Group medicinesGroup = SystemControl.getGroup(medicinesGroupId);
        this.setMedicinesGroup(medicinesGroup);

        medicinesGroup.setGroupMedicineItems(this);
        medicinesGroup.getGroupMedicineItemsNames().add(medicineName);

        Department medicinesDepartment = SystemControl.getDepartment(medicineDepartmentId);
        this.setMedicineDepartment(medicinesDepartment);

        medicinesDepartment.setDepartmentItems(this);
        medicinesDepartment.getDepartmentItemsNames().add(medicineName);

        count++;
    }

    public MedicineItem(String medicineName, String about, Group medicinesGroup, Department medicineDepartment) {
        this.setId(count);
        this.setMedicineName(medicineName);
        this.setAbout(about);
        this.setMedicinesGroup(medicinesGroup);
        this.setMedicineDepartment(medicineDepartment);


        medicinesGroup.setGroupMedicineItems(this);
        medicinesGroup.getGroupMedicineItemsNames().add(medicineName);


        medicineDepartment.setDepartmentItems(this);
        medicineDepartment.getDepartmentItemsNames().add(medicineName);

        count++;
    }


    public String getMedicineName() {
        return MedicineName;
    }

    public void setMedicineName(String medicineName) {
        MedicineName = medicineName;
    }


    public Group getMedicinesGroup() {
        return medicinesGroup;
    }

    public void setMedicinesGroup(Group medicinesGroup) {
        this.medicinesGroup = medicinesGroup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Department getMedicineDepartment() {
        return medicineDepartment;
    }

    public void setMedicineDepartment(Department medicineDepartment) {
        this.medicineDepartment = medicineDepartment;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getUses() {
        return uses;
    }

    public void setUses(String uses) {
        this.uses = uses;
    }

    public String getSideEffect() {
        return sideEffect;
    }

    public void setSideEffect(String sideEffect) {
        this.sideEffect = sideEffect;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }
}
