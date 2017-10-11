package com.hpdeveloper.rxretrofitmvvm.di.modules;

import com.hpdeveloper.rxretrofitmvvm.api.GetAndroidOS;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by hirenpatel on 10/10/17.
 */

@Module
public class AndroidOSModule {

    @Provides
    @Singleton
    GetAndroidOS getAndroidOS(Retrofit retrofit){
        return retrofit.create(GetAndroidOS.class);
    }
}
