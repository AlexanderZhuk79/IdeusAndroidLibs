package biz.ideus.sample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.Random;

import biz.ideus.annotationsprocessing.State;
import biz.ideus.mvvm.AbstractViewModel;

/**
 * Created by user on 05.01.2018.
 */

public class MainActivityVM extends AbstractViewModel<MainActivityIView> {
    private static String TAG = "MainActivityVM";
    @State
    String testString;
    Integer testInteger;
    int testInt;

    @Override
    public void onCreate(@Nullable Bundle arguments, @Nullable Bundle savedInstanceState) {
        super.onCreate(arguments, savedInstanceState);
        StateHelperMainActivityVM.onRestoreInstanceState(this, savedInstanceState);
        Log.d(TAG, testString + " restored");
        testString = new Random().nextInt() + "====";
        Log.d(TAG, testString + " Random");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        StateHelperMainActivityVM.onSaveInstanceState(this, bundle);
        Log.d(TAG, testString + " saved");
    }
}
