package com.zou.android.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by Zou on 2016/9/27.
 */

public abstract class SingleFragmentActivity extends FragmentActivity {

    protected abstract Fragment createFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager mFragmentManager=getSupportFragmentManager();
        Fragment fragment=mFragmentManager.findFragmentById(R.id.fragment_container);
        //如果fragment已存在于队列中则直接加载
        if (fragment==null){
            fragment=createFragment();
            mFragmentManager.beginTransaction().add(R.id.fragment_container,fragment).commit();
        }//不存在于队列中，提交事务创建新Fragment
    }
}
