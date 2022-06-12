package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import com.onegravity.contactpicker.contact.Contact;
import com.onegravity.contactpicker.contact.ContactDescription;
import com.onegravity.contactpicker.contact.ContactSortOrder;
import com.onegravity.contactpicker.core.ContactPickerActivity;
import com.onegravity.contactpicker.picture.ContactPictureType;
import java.security.acl.Group;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
//    Button btn_contact;
//    private int REQUEST_CONTACT=0;

    Button btn;
    EditText txtdate;
    TextView txtview;
    DatePickerDialog db;
    int mYear, mMonth, mDay;

    DatePicker dp;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        txtdate = findViewById(R.id.editDate);
        txtview = findViewById(R.id.txtview);


txtdate.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Calendar c = Calendar.getInstance();
        mYear = c.get(Calendar.YEAR);
        mDay = c.get(Calendar.DAY_OF_MONTH);
        mMonth = c.get(Calendar.MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day)
            {
                txtdate.setText(day+"-"+(month)+"-"+year);
            }
        },mYear,mMonth,mDay);
        datePickerDialog.getDatePicker().setMinDate(c.getTimeInMillis());
        datePickerDialog.show();
    }
});

    }
}




















//    @SuppressLint("MissingSuperCall")
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (requestCode == REQUEST_CONTACT && resultCode == Activity.RESULT_OK &&
//                data != null && data.hasExtra(ContactPickerActivity.RESULT_CONTACT_DATA)) {
//
//            // we got a result from the contact picker
//
//            // process contacts
//            List<Contact> contacts = (List<Contact>) data.getSerializableExtra(ContactPickerActivity.RESULT_CONTACT_DATA);
//            for (Contact contact : contacts) {
//                // process the contacts...
//            }
//
//            // process groups
//            List<Group> groups = (List<Group>) data.getSerializableExtra(ContactPickerActivity.RESULT_GROUP_DATA);
//            for (Group group : groups) {
//                // process the groups...
//            }
//        }
//    }



























//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(view == txtdate)
//                {
//                    txtview.setText("hhdh");
//                }
//                txtview.setText(txtdate.getText().toString());
//            }
//        });

//        btn_contact = findViewById(R.id.btn1);
//
//        btn_contact.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, ContactPickerActivity.class)
//                        .putExtra(ContactPickerActivity.EXTRA_CONTACT_BADGE_TYPE, ContactPictureType.ROUND.name())
//                        .putExtra(ContactPickerActivity.EXTRA_SHOW_CHECK_ALL, true)
//                        .putExtra(ContactPickerActivity.EXTRA_CONTACT_DESCRIPTION, ContactDescription.ADDRESS.name())
//                        .putExtra(ContactPickerActivity.EXTRA_CONTACT_DESCRIPTION_TYPE, ContactsContract.CommonDataKinds.Email.TYPE_WORK)
//                        .putExtra(ContactPickerActivity.EXTRA_CONTACT_SORT_ORDER, ContactSortOrder.AUTOMATIC.name());
//                startActivityForResult(intent, REQUEST_CONTACT);
//            }
//        });