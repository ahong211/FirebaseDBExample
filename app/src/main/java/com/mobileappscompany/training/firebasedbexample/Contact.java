package com.mobileappscompany.training.firebasedbexample;

/**
 * Created by Albert on 5/12/17.
 */

public class Contact {
    private String mName;
    private String mPhone;

    public Contact() {
    }

    public Contact(String mName, String mPhone) {
        this.mName = mName;
        this.mPhone = mPhone;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }
}
