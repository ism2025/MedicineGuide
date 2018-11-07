package com.example.basmatech.medicineguide.Control;

import android.app.Activity;
import android.widget.Toast;

import com.example.basmatech.medicineguide.model.Department;
import com.example.basmatech.medicineguide.model.Group;
import com.example.basmatech.medicineguide.model.MedicineItem;

import java.util.ArrayList;

public class SystemControl {
    public static ArrayList<Group> Groups = new ArrayList<>();
    public static ArrayList<String> GroupNames = new ArrayList<>();
    public static ArrayList<Department> Departments = new ArrayList<>();
    public static ArrayList<String> DepartmentNames = new ArrayList<>();
    public static ArrayList<String> testArrayList = new ArrayList<>();


    //Group Methods
    public static Group getGroup(int GroupId) {
        Group tmp = null;
        for (Group group : SystemControl.Groups) {
            if (group.getId() == GroupId) {
                tmp = group;
                break;
            }
        }

        return tmp;
    }

    public static Group getGroup(String GroupName) {
        Group tmp = null;
        for (Group group : SystemControl.Groups) {
            if (group.getName().equals(GroupName)) {
                tmp = group;
                break;
            }
        }
        return tmp;
    }

    public static MedicineItem getMedicineByGroup(int GroupId, int MedicineId) {
        Group mg = getGroup(GroupId);
        MedicineItem tmp = null;
        for (MedicineItem medicineItem : mg.getGroupMedicineItems()) {
            if (medicineItem.getId() == MedicineId) {
                tmp = medicineItem;
                break;
            }
        }
        return tmp;
    }

    public static MedicineItem getMedicineByGroup(String GroupName, String MedicineName) {
        Group mg = getGroup(GroupName);
        MedicineItem tmp = null;
        for (MedicineItem mi : mg.getGroupMedicineItems()) {
            if (mi.getMedicineName().equals(MedicineName)) {
                tmp = mi;
                break;
            }
        }
        return tmp;
    }

    //Department Methods
    public static Department getDepartment(int DepartmentId) {
        Department tmp = null;
        for (Department department : SystemControl.Departments) {
            if (department.getId() == DepartmentId) {
                tmp = department;
                break;
            }
        }

        return tmp;
    }

    public static Department getDepartment(String dName) {
        Department tmp = null;
        for (Department d : SystemControl.Departments) {
            if (d.getName().equals(dName)) {
                tmp = d;
                break;
            }
        }
        return tmp;
    }

    public static MedicineItem getMedicineByDepartment(int DepartmentId, int MedicineId) {
        Department md = getDepartment(DepartmentId);
        MedicineItem tmp = null;
        if (md != null) {
            for (MedicineItem medicineItem : md.getDepartmentItems()) {
                if (medicineItem.getId() == MedicineId) {
                    tmp = medicineItem;
                    break;
                }
            }
        }
        return tmp;
    }

    public static MedicineItem getMedicineByDepartment(String DepartmentName, String MedicineName) {
        Department md = getDepartment(DepartmentName);
        MedicineItem tmp = null;
        for (MedicineItem mi : md.getDepartmentItems()) {
            if (mi.getMedicineName().equals(MedicineName)) {
                tmp = mi;
                break;
            }
        }
        return tmp;
    }

    //Create anew Items Methods
    public static Group AddNewGroup(String groupName) {
        Group mg = new Group(groupName);
        return mg;
    }

    public static Department AddNewDepartment(String departmentName) {
        Department mg = new Department(departmentName);
        return mg;
    }

    public static MedicineItem AddNewMedicine(String medicineName, String medicinDescreption, int medicinesGroupId, int medicineDepartmentId) {
        MedicineItem mi = new MedicineItem(medicineName, medicinDescreption, medicinesGroupId, medicineDepartmentId);
        return mi;
    }

    public static MedicineItem AddNewMedicine(String medicineName, String about, Group medicinesGroup, Department medicineDepartment) {
        MedicineItem mi = new MedicineItem(medicineName, about, medicinesGroup, medicineDepartment);
        return mi;
    }


}
