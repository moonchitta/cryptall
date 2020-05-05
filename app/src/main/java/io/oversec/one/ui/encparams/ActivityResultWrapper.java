package io.oversec.one.ui.encparams;

import android.content.Intent;

public class ActivityResultWrapper {
    private final int mRequestCode;
    private final int mResultCode;
    private final Intent mData;

    public ActivityResultWrapper(int requestCode, int resultCode, Intent data) {
        mRequestCode = requestCode;
        mResultCode = resultCode;
        mData = data;
    }

    public int getRequestCode() {
        return mRequestCode;
    }

    public int getResultCode() {
        return mResultCode;
    }

    public Intent getData() {
        return mData;
    }
}
