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

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }
}
