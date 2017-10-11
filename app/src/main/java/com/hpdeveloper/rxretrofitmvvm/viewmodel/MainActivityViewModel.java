package com.hpdeveloper.rxretrofitmvvm.viewmodel;

import android.util.Log;

import com.hpdeveloper.rxretrofitmvvm.api.GetAndroidOS;
import com.hpdeveloper.rxretrofitmvvm.model.AndroidOS;
import com.hpdeveloper.rxretrofitmvvm.view.MainActivityView;

import java.util.ArrayList;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by hirenpatel on 10/10/17.
 */

public class MainActivityViewModel extends BaseViewModel<MainActivityView> {

    private GetAndroidOS getAndroidOS;

    public MainActivityViewModel(GetAndroidOS getAndroidOS) {
        this.getAndroidOS = getAndroidOS;
    }

    public void getAllAndroidOS() {
        compositeDisposable.add(getAndroidOS.getAndroidOS()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(getObserver()));

    }

    private DisposableObserver<ArrayList<AndroidOS>> getObserver() {
        return new DisposableObserver<ArrayList<AndroidOS>>() {

            @Override
            public void onNext(ArrayList<AndroidOS> value) {
                for (AndroidOS androidOS : value) {
                    Log.i(TAG, androidOS.getName());

                    view.onDataLoad(value);
                }
            }

            @Override
            public void onError(Throwable e) {
            }

            @Override
            public void onComplete() {
            }
        };
    }
}
