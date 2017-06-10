package com.example.android.androidassignment82;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class MainActivity extends AppCompatActivity {

    // Declarig data members
    private String[] mContactNames={"Raja","Ravi","Rajeev","Sanjeev","Chandan","Amit","Ankit"};
    private String[] mContactNumbers={"222222222","111111111","12121212","22334455","7777777777","888888888","999999999"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        HashSet<Contact>setContacts = new HashSet<>();
        for(int i =0; i<mContactNames.length && i< mContactNumbers.length; i++){
            setContacts.add(new Contact(mContactNames[i],mContactNumbers[i]));
        }
        ArrayList<Contact> listContact = new ArrayList<Contact>(setContacts);
        //sort mCntactNames by using Comparator by Name
        Collections.sort(listContact, Contact.NameComparator);

        // passing listContact through ContactsAdapter object
        ContactsAdapter contactsAdapter = new ContactsAdapter(this, listContact);
        //Get a reference to the listView
        ListView listView = (ListView)findViewById(R.id.list_contact);
        //setAdapter to the ListView
        listView.setAdapter(contactsAdapter);
    }
}
