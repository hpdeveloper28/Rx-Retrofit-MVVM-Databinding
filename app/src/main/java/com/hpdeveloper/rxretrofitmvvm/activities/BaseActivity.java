package com.hpdeveloper.rxretrofitmvvm.activities;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;

import com.hpdeveloper.rxretrofitmvvm.viewmodel.BaseViewModel;
import com.hpdeveloper.rxretrofitmvvm.viewmodel.IView;

/**
 * Created by hirenpatel on 10/10/17.
 */

public abstract class BaseActivity<B extends ViewDataBinding, T extends BaseViewModel> extends AppCompatActivity implements IView {

    B binding;
    T viewModel;

    protected void bindView(int layoutId) {
        binding = DataBindingUtil.setContentView(this, layoutId);
    }

    @Override
    protected void onDestroy() {
        viewModel.detach();
        super.onDestroy();
    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onFailure(Throwable throwable) {

    }
}
