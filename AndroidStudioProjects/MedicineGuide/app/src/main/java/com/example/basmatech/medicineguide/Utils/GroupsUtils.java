package com.example.basmatech.medicineguide.Utils;

import android.app.Activity;
import android.widget.Toast;

import com.example.basmatech.medicineguide.Activities.MainActivity;
import com.example.basmatech.medicineguide.Control.SystemControl;
import com.example.basmatech.medicineguide.model.Department;
import com.example.basmatech.medicineguide.model.Group;
import com.example.basmatech.medicineguide.model.MedicineItem;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroupsUtils {
    public MainActivity activity;

    public GroupsUtils(MainActivity activity) {
        this.activity = activity;
    }

    public void getGroups() {
        try {
            InputStream inputStream = activity.getAssets().open("Groups.txt");
            Scanner groupFile = new Scanner(inputStream);
            while (groupFile.hasNextLine()) {
                String groupName = groupFile.nextLine();
                new Group(groupName);
            }
        } catch (IOException e) {

        }
    }

    public void getDepartments() {
        try {
            InputStream inputStream = activity.getAssets().open("Departments.txt");
            Scanner groupFile = new Scanner(inputStream);
            while (groupFile.hasNextLine()) {
                String departmentName = groupFile.nextLine();
                new Department(departmentName);
            }
        } catch (IOException e) {

        }
    }

    //    public void getMedicines() {
//        try {
//            InputStream inputStream = activity.getAssets().open("Medicines.txt");
//            Scanner medicineFile = new Scanner(inputStream);
//            while (medicineFile.hasNextLine()) {
//                String medicineName = medicineFile.nextLine();
//                new MedicineItem(medicineName);
//                SystemControl.testArrayList.add(medicineName);
////                Group g = SystemControl.getGroup(medicineFile.nextLine());
////                Department d = SystemControl.getDepartment(medicineFile.nextLine());
////                String mAbout = medicineFile.nextLine();
//
////                String mUses = medicineFile.nextLine();
////                String mSideEffect = medicineFile.nextLine();
////                String mDose = medicineFile.nextLine();
////                if (g != null && d != null) {
////                    MedicineItem x = SystemControl.AddNewMedicine(medicineName, mAbout, g, d);
////                    if (!mUses.startsWith("-")) {
////                        medicineItem.setUses(mUses);
////                    }
////                    if (!mSideEffect.startsWith("-")) {
////                        medicineItem.setSideEffect(mSideEffect);
////                    }
////                    if (!mDose.startsWith("-")) {
////                        medicineItem.setDose(mDose);
////                    }
////                } else {
////                    Toast.makeText(activity, "dsdasfaef", Toast.LENGTH_SHORT).show();
////                }
//            }
//        } catch (IOException e) {
//
//        }
//    }


    public static void GenerateData() {


        Group mg1 = SystemControl.AddNewGroup("المجموعة التجريبية 1 ");
        Group mg2 = SystemControl.AddNewGroup("المجموعة التجريبية 2 ");
        Group mg3 = SystemControl.AddNewGroup("المجموعة التجريبية 3 ");
        Group mg4 = SystemControl.AddNewGroup("المجموعة التجريبية 4 ");
        Group mg5 = SystemControl.AddNewGroup("المجموعة التجريبية 5 ");

        Department md1 = SystemControl.AddNewDepartment("القسم الأول التجريبي ");
        Department md2 = SystemControl.AddNewDepartment("القسم الثاني التجريبي ");
        Department md3 = SystemControl.AddNewDepartment("القسم الثالث التجريبي ");
        Department md4 = SystemControl.AddNewDepartment("القسم الرابع التجريبي ");
        Department md5 = SystemControl.AddNewDepartment("القسم الخامس التجريبي ");

        SystemControl.AddNewMedicine("الدواء رقم 1 في المجموعة 1 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg1, md1);
        SystemControl.AddNewMedicine("الدواء رقم 2 في المجموعة 1 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg1, md1);
        SystemControl.AddNewMedicine("الدواء رقم 3 في المجموعة 1 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg1, md1);
        SystemControl.AddNewMedicine("الدواء رقم 4 في المجموعة 1 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg1, md1);
        SystemControl.AddNewMedicine("الدواء رقم 5 في المجموعة 1 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg1, md1);


        SystemControl.AddNewMedicine("الدواء رقم 1 في المجموعة 2 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg2, md1);
        SystemControl.AddNewMedicine("الدواء رقم 2 في المجموعة 2 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg2, md1);
        SystemControl.AddNewMedicine("الدواء رقم 3 في المجموعة 2 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg2, md1);
        SystemControl.AddNewMedicine("الدواء رقم 4 في المجموعة 2 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg2, md1);
        SystemControl.AddNewMedicine("الدواء رقم 5 في المجموعة 2 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg2, md1);

        SystemControl.AddNewMedicine("الدواء رقم 1 في المجموعة 3 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg3, md1);
        SystemControl.AddNewMedicine("الدواء رقم 2 في المجموعة 3 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg3, md1);
        SystemControl.AddNewMedicine("الدواء رقم 3 في المجموعة 3 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg3, md1);
        SystemControl.AddNewMedicine("الدواء رقم 4 في المجموعة 3 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg3, md1);
        SystemControl.AddNewMedicine("الدواء رقم 5 في المجموعة 3 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg3, md1);


        SystemControl.AddNewMedicine("الدواء رقم 1 في المجموعة 4 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg4, md1);
        SystemControl.AddNewMedicine("الدواء رقم 2 في المجموعة 4 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg4, md1);
        SystemControl.AddNewMedicine("الدواء رقم 3 في المجموعة 4 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg4, md1);
        SystemControl.AddNewMedicine("الدواء رقم 4 في المجموعة 4 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg4, md1);
        SystemControl.AddNewMedicine("الدواء رقم 5 في المجموعة 4 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg4, md1);


        SystemControl.AddNewMedicine("الدواء رقم 1 في المجموعة 5 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg5, md1);
        SystemControl.AddNewMedicine("الدواء رقم 2 في المجموعة 5 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg5, md1);
        SystemControl.AddNewMedicine("الدواء رقم 3 في المجموعة 5 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg5, md1);
        SystemControl.AddNewMedicine("الدواء رقم 4 في المجموعة 5 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg5, md1);
        SystemControl.AddNewMedicine("الدواء رقم 5 في المجموعة 5 وقسمه هو 1", "هنا وصف الدواء و معلوماته", mg5, md1);

        SystemControl.AddNewMedicine("الدواء رقم 1 في القسم 1 و مجموعته هي 1", "يمكنك وضع اي نص هنا ", mg1, md1);
        SystemControl.AddNewMedicine("الدواء رقم 1 في القسم 1 و مجموعته هي 1", "يمكنك وضع اي نص هنا ", mg1, md1);
        SystemControl.AddNewMedicine("الدواء رقم 1 في القسم 1 و مجموعته هي 1", "يمكنك وضع اي نص هنا ", mg1, md1);
        SystemControl.AddNewMedicine("الدواء رقم 1 في القسم 1 و مجموعته هي 1", "يمكنك وضع اي نص هنا ", mg1, md1);
        SystemControl.AddNewMedicine("الدواء رقم 1 في القسم 1 و مجموعته هي 1", "يمكنك وضع اي نص هنا ", mg1, md3);

        SystemControl.AddNewMedicine("الدواء رقم 1 في القسم 1 و مجموعته هي 1", "يمكنك وضع اي نص هنا ", mg2, md2);
        SystemControl.AddNewMedicine("الدواء رقم 1 في القسم 1 و مجموعته هي 1", "يمكنك وضع اي نص هنا ", mg5, md5);
        SystemControl.AddNewMedicine("الدواء رقم 1 في القسم 1 و مجموعته هي 1", "يمكنك وضع اي نص هنا ", mg4, md2);
        SystemControl.AddNewMedicine("الدواء رقم 1 في القسم 1 و مجموعته هي 1", "يمكنك وضع اي نص هنا ", mg2, md3);
        SystemControl.AddNewMedicine("الدواء رقم 1 في القسم 1 و مجموعته هي 1", "يمكنك وضع اي نص هنا ", mg3, md3);

        SystemControl.AddNewMedicine("الدواء رقم 1 في القسم 1 و مجموعته هي 1", "يمكنك وضع اي نص هنا ", mg2, md1);
        SystemControl.AddNewMedicine("الدواء رقم 1 في القسم 1 و مجموعته هي 1", "يمكنك وضع اي نص هنا ", mg2, md3);
        SystemControl.AddNewMedicine("الدواء رقم 1 في القسم 1 و مجموعته هي 1", "يمكنك وضع اي نص هنا ", mg3, md5);
        SystemControl.AddNewMedicine("الدواء رقم 1 في القسم 1 و مجموعته هي 1", "يمكنك وضع اي نص هنا ", mg4, md4);
        SystemControl.AddNewMedicine("الدواء رقم 1 في القسم 1 و مجموعته هي 1", "يمكنك وضع اي نص هنا ", mg1, md4);

        SystemControl.AddNewMedicine("الدواء رقم 1 في القسم 1 و مجموعته هي 1", "يمكنك وضع اي نص هنا ", mg5, md4);
        SystemControl.AddNewMedicine("الدواء رقم 1 في القسم 1 و مجموعته هي 1", "يمكنك وضع اي نص هنا ", mg5, md4);
        SystemControl.AddNewMedicine("الدواء رقم 1 في القسم 1 و مجموعته هي 1", "يمكنك وضع اي نص هنا ", mg3, md3);
        SystemControl.AddNewMedicine("الدواء رقم 1 في القسم 1 و مجموعته هي 1", "يمكنك وضع اي نص هنا ", mg2, md2);
        SystemControl.AddNewMedicine("الدواء رقم 1 في القسم 1 و مجموعته هي 1", "يمكنك وضع اي نص هنا ", mg2, md5);

    }

}
