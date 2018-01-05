package biz.ideus.sample;


import android.os.Bundle;
import android.support.annotation.Nullable;

import biz.ideus.mvvm.base.ViewModelBaseActivity;
import biz.ideus.mvvm.binding.ViewModelBindingConfig;

public class MainActivity extends ViewModelBaseActivity<MainActivityIView, MainActivityVM> implements MainActivityIView {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setModelView(this);
    }

    @Nullable
    @Override
    public ViewModelBindingConfig getViewModelBindingConfig() {
        return new ViewModelBindingConfig(R.layout.activity_main, BR.viewModel, this);
    }
}
