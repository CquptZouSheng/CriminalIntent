package com.zou.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Zou on 2016/9/27.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
