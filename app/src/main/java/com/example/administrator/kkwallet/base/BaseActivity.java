package com.example.administrator.kkwallet.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.kkwallet.R;

/**
 * Created by Administrator on 2018/7/3 0003.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(getLayout());
        onInitView();
        onDate();
    }

    protected abstract void onDate();

    protected abstract void onInitView();

    protected abstract int getLayout();
}
