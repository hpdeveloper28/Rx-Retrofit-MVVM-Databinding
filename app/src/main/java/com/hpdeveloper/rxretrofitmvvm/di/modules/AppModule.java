package com.hpdeveloper.rxretrofitmvvm.di.modules;

import com.hpdeveloper.rxretrofitmvvm.MyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hirenpatel on 10/10/17.
 */
@Module
public class AppModule {

    private MyApplication myApplication;

    public AppModule(MyApplication application) {
        myApplication = application;
    }

    @Provides
    @Singleton
    MyApplication getMyApplication() {
        return myApplication;
    }
}
