package com.example.cassavachat;

import java.util.ArrayList;

public class Chat {
    private String mName;
    private String mPhone;


    public Chat(String name, String phoneNumber) {
        mName = name;
        mPhone = phoneNumber;

    }

    public String getName() {
        return mName;
    }

    public String getPhone(){
        return mPhone;
    }


}
