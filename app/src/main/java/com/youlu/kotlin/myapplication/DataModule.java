package com.youlu.kotlin.myapplication;

import android.content.Context;

import com.youlu.kotlin.myapplication.service.LoginService;
import com.youlu.kotlin.myapplication.service.LoginServiceImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;

//详见上面的 hilt 对应组件
//@InstallIn(ActivityComponent.class) //activity生命周期
@InstallIn(SingletonComponent.class) //单例
@Module
public class DataModule {


    //    @Singleton
//    @Provides
//    public LoginService getLoginService(){
//        return new LoginServiceImpl();
//    }

    /**
     * 使用application的context
     * @param context
     * @return
     */
    @Singleton
    @Provides
    public LoginService getLoginService(@ApplicationContext Context context) {
        return new LoginServiceImpl(context);
    }
}

