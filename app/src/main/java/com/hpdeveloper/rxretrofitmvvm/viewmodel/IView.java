package com.hpdeveloper.rxretrofitmvvm.viewmodel;

/**
 * Created by hirenpatel on 10/10/17.
 */

public interface IView {

    void onSuccess();

    void onFailure(Throwable throwable);
}
