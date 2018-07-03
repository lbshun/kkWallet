package com.example.administrator.kkwallet;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.example.administrator.kkwallet.activity.TiShi;
import com.example.administrator.kkwallet.base.BaseActivity;

public class MainActivity extends BaseActivity {

    private Button but_kai;

    @Override
    protected void onDate() {

    }

    @Override
    protected void onInitView() {
        //开始使用按钮
        but_kai = (Button) findViewById(R.id.but_kai);
        //单机使用按钮
        but_kai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //单击时进行跳转
                Intent intent = new Intent(MainActivity.this,TiShi.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }
}
