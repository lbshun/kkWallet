package com.example.administrator.kkwallet.moudle;

/**
 * Created by Administrator on 2018/7/3 0003.
 */

public class GetMoudle {
    private CallBackData callBackData;
    //定义内部接口
    public interface CallBackData {
        void onFailure(Object object);

        void onSuccess(Object object);
    }
    //初始内部接口
    public void setOnCallBackData(CallBackData callBackData) {
        this.callBackData = callBackData;
    }

    public void getDengLu() {

    }

}
