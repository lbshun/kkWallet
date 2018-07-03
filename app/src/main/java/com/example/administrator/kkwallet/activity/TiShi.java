package com.example.administrator.kkwallet.activity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.example.administrator.kkwallet.R;
import com.example.administrator.kkwallet.base.BaseActivity;

/**
 * Created by Administrator on 2018/7/3 0003.
 */

public class TiShi extends BaseActivity {

    private Button but_queren;

    @Override
    protected void onDate() {
        but_queren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //单击时进行跳转
                Intent intent = new Intent(TiShi.this, BeiFenZhuJi_one.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onInitView() {
        but_queren = (Button) findViewById(R.id.but_queren);

    }

    @Override
    protected int getLayout() {
        return R.layout.shouye_view;
    }
}
