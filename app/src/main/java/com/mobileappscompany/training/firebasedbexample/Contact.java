package com.mobileappscompany.training.firebasedbexample;

/**
 * Created by Albert on 5/12/17.
 */

public class Contact {
    private String mName;
    private String mPhone;
    private String mKey;

    public Contact() {
    }

    public Contact(String name, String phone, String key) {
        mName = name;
        mPhone = phone;
        mKey = key;
    }

    public String getKey() {
        return mKey;
    }

    public void setKey(String key) {
        mKey = key;
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
