package com.bawei.dingjianfei20191203.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.RadioGroup;

import com.bawei.dingjianfei20191203.R;
import com.bawei.dingjianfei20191203.base.BaseAppactivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseAppactivity {
private ViewPager viewPager;
private RadioGroup group;
private List<Fragment> list=new ArrayList<>();

    @Override
    protected void initDate() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int layputId() {
        return R.layout.activity_main;
    }
}
