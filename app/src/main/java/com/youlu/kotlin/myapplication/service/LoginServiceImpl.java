package com.youlu.kotlin.myapplication.service;

import android.content.Context;
import android.widget.Toast;

/**
 * @author : YOULU  ywj
 * date   : 0009 2022/9/9 上午 9:40
 */
public class LoginServiceImpl implements LoginService{
    private Context context;

    public LoginServiceImpl() {
    }

    public LoginServiceImpl(Context context) {

        this.context = context;
    }

    @Override
    public void goLogin() {
        System.out.println("goLogin:"+hashCode()+",context:"+context.hashCode());
        if (context != null) {
            Toast.makeText(context, "hhh", Toast.LENGTH_SHORT).show();
        }
    }
}