package com.acadgild.balu.acd_an_session_4_assignment_2_main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    ArrayList<Contact> arrayList_contacts;
    CustomAdapter customAdapter_contacts;
    ListView listView_contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList_contacts = new ArrayList<>();

        arrayList_contacts.add(new Contact("Sachin Tendulkar", "9876543210"));
        arrayList_contacts.add(new Contact("Sourav Ganguly", "9843210765"));
        arrayList_contacts.add(new Contact("Rahul Dravid", "9321087654"));
        arrayList_contacts.add(new Contact("MS Dhoni", "9817654320"));
        arrayList_contacts.add(new Contact("Virat Kohli", "9827654310"));
        arrayList_contacts.add(new Contact("Suresh Raina", "9876543210"));
        arrayList_contacts.add(new Contact("Virendra Sehwag", "9843210765"));
        arrayList_contacts.add(new Contact("VVS Laxman", "9321087654"));
        arrayList_contacts.add(new Contact("Rohit Sharma", "9817654320"));
        arrayList_contacts.add(new Contact("Gautam Gambhir", "9827654310"));
        arrayList_contacts.add(new Contact("Harbhajan Singh", "9876543210"));
        arrayList_contacts.add(new Contact("Shikhar Dhawan", "9843210765"));
        arrayList_contacts.add(new Contact("Javagal Srinath", "9321087654"));
        arrayList_contacts.add(new Contact("Anil Kumble", "9817654320"));
        arrayList_contacts.add(new Contact("Ajit Agarkar", "9827654310"));

        listView_contacts = (ListView) findViewById(R.id.listView_contacts);
        customAdapter_contacts = new CustomAdapter(getApplicationContext(), arrayList_contacts);
        listView_contacts.setAdapter(customAdapter_contacts);
    }
}
