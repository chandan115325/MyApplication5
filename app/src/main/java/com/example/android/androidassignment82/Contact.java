package com.example.android.androidassignment82;

import java.util.Comparator;

/**
 * Created by CHANDAN on 6/9/2017.
 */


public class Contact {
    // Declaring data variables
    private String mContactName;
    private String mContactNumber;


    /**
     * Constructor to initialize the parameters
     *
     * @param contactName
     * @param contactNumber
     */
    public Contact(String contactName, String contactNumber) {
        mContactName = contactName;
        mContactNumber = contactNumber;
    }

    /*Comparator for sorting the list by  mContactName*/
    public static Comparator<Contact> NameComparator = new Comparator<Contact>() {

        public int compare(Contact s1, Contact s2) {
            String ContactName1 = s1.getmContactName().toUpperCase();
            String ContactName2 = s2.getmContactName().toUpperCase();

            //ascending order
            return ContactName1.compareTo(ContactName2);

        }
    };
        // getter  methods to retrieve the values
        public String getmContactName() {
            return mContactName;
        }


        public String getmContactNumber() {
            return mContactNumber;
        }


    }
