package com.acadgild.balu.acd_an_session_4_assignment_2_main;

/**
 * Created by BALU on 5/9/2016.
 */
public class Contact
{
    private String contact_name;
    private String contact_number;

    public Contact(String contact_name, String contact_number) {
        this.contact_name = contact_name;
        this.contact_number = contact_number;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }
}
