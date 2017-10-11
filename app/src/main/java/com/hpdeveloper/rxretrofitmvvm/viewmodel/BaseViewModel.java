package com.hpdeveloper.rxretrofitmvvm.viewmodel;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by hirenpatel on 10/10/17.
 */

public class BaseViewModel<T extends IView> {

    public String TAG = BaseViewModel.class.getSimpleName();

    T view;

    public BaseViewModel(){
        compositeDisposable = new CompositeDisposable();
    }

    protected CompositeDisposable compositeDisposable;

    public void attach(T view) {
        this.view = view;
    }

    public void detach() {
        view = null;
    }

    public void clearSubscriptions() {
        compositeDisposable.clear();
    }
}
