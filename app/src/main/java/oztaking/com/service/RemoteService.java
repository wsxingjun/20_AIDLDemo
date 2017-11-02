package oztaking.com.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.widget.Toast;

import oztaking.com.service.IMyAidlInterface;


/**
 * Created by Administrator on 2017-11-02.
 */

public class RemoteService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new MyRemoteService();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    public void RemoteServiceMethod(){
        System.out.println("我是远程服务里面的方法");
    }


    private class MyRemoteService extends IMyAidlInterface.Stub {


        @Override
        public void CallRemoteServiceMethod()  {
            RemoteServiceMethod();
        }
    }
}
