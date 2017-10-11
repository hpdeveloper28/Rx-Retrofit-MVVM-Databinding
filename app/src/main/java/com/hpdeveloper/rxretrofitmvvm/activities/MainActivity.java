package com.hpdeveloper.rxretrofitmvvm.activities;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.hpdeveloper.rxretrofitmvvm.MyApplication;
import com.hpdeveloper.rxretrofitmvvm.R;
import com.hpdeveloper.rxretrofitmvvm.adapters.AndroidOSAdapter;
import com.hpdeveloper.rxretrofitmvvm.api.GetAndroidOS;
import com.hpdeveloper.rxretrofitmvvm.databinding.ActivityMainBinding;
import com.hpdeveloper.rxretrofitmvvm.model.AndroidOS;
import com.hpdeveloper.rxretrofitmvvm.view.MainActivityView;
import com.hpdeveloper.rxretrofitmvvm.viewmodel.MainActivityViewModel;

import java.util.ArrayList;

import javax.inject.Inject;

public class MainActivity extends BaseActivity<ActivityMainBinding, MainActivityViewModel> implements MainActivityView{

    @Inject GetAndroidOS getAndroidOS;
    private AndroidOSAdapter androidOSAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyApplication.getAppComponent().inject(this);

        viewModel = new MainActivityViewModel(getAndroidOS);
        viewModel.attach(this);
        bindView(R.layout.activity_main);
        binding.setIsLoading(true);
        viewModel.getAllAndroidOS();
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        androidOSAdapter = new AndroidOSAdapter();
        binding.recyclerView.setAdapter(androidOSAdapter);
    }

    @Override
    public void onDataLoad(ArrayList<AndroidOS> androidOSList) {
        binding.setIsLoading(false);
        androidOSAdapter.updateData(androidOSList);
    }

}
