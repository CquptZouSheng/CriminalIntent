package com.zou.android.criminalintent;

import java.util.UUID;

/**
 * Created by Zou on 2016/9/25.
 */

public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime() {
        mId=UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
