package com.zou.android.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CrimeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);
        FragmentManager mFragmentManager=getSupportFragmentManager();
        Fragment fragment=mFragmentManager.findFragmentById(R.id.fragment_container);
        //如果fragment已存在于队列中则直接加载
        if (fragment==null){
            fragment=new CrimeFragment();
            mFragmentManager.beginTransaction().add(R.id.fragment_container,fragment).commit();
        }//不存在于队列中，提交事务创建新Fragment
    }
}
