package com.hpdeveloper.rxretrofitmvvm.view;

import com.hpdeveloper.rxretrofitmvvm.model.AndroidOS;
import com.hpdeveloper.rxretrofitmvvm.viewmodel.IView;

import java.util.ArrayList;

/**
 * Created by hirenpatel on 10/10/17.
 */

public interface MainActivityView extends IView {

    void onDataLoad(ArrayList<AndroidOS> androidOSList);

}
