package com.example.android.androidassignment82;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by CHANDAN on 6/10/2017.
 */

public class ContactsAdapter extends ArrayAdapter {
    private TextView mContactNameText;
    private TextView mContactNumberText;
    /**
     * contructor to initialize the context and hashset
     * @param context
     * @param mContacts
     */
    public ContactsAdapter(Activity context, ArrayList<Contact> mContacts){
        super(context,0,  mContacts);
    }




    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View mContactView = view;
        //Check if the existing view is being reused, otherwise inflate the view
        if(mContactView == null){
            mContactView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        //Get the{@link Contact} object located at this position in the list
        Contact currentContact = (Contact) getItem(position);

        mContactNameText = (TextView)mContactView.findViewById(R.id.contactName);
        mContactNameText.setText(currentContact.getmContactName());

        mContactNumberText = (TextView)mContactView.findViewById(R.id.contactNumber);
        mContactNumberText.setText(currentContact.getmContactNumber());

        return mContactView;
    }
}
