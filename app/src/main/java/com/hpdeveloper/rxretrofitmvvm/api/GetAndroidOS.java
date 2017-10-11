package com.hpdeveloper.rxretrofitmvvm.api;

import com.hpdeveloper.rxretrofitmvvm.model.AndroidOS;

import java.util.ArrayList;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by hirenpatel on 10/10/17.
 */

public interface GetAndroidOS {

    @GET("android/jsonarray")
    Observable<ArrayList<AndroidOS>> getAndroidOS();

}
