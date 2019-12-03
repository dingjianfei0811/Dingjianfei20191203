package com.bawei.dingjianfei20191203.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 作者：丁建飞
 * 时间：2019/12/3  9:15
 * 类名：com.bawei.dingjianfei20191203.base
 */
public abstract class BaseAppactivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(layputId());
        initView();
        initDate();
    }

    protected abstract void initDate();

    protected abstract void initView();

    protected abstract int layputId();
}
