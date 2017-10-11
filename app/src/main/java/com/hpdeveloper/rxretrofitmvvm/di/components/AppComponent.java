package com.hpdeveloper.rxretrofitmvvm.di.components;

import com.hpdeveloper.rxretrofitmvvm.activities.MainActivity;
import com.hpdeveloper.rxretrofitmvvm.di.modules.AndroidOSModule;
import com.hpdeveloper.rxretrofitmvvm.di.modules.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by hirenpatel on 10/10/17.
 */
@Singleton
@Component(modules = {AndroidOSModule.class, NetworkModule.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
